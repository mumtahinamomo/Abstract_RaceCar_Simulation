package main;
/**
 * This class manages the movements of cars, pit stops, and the finish line, and logs the events occurring during the race.
 */
public class RaceTrack {
  int finishposition; // Stores the place where the latest car finished
  int ticks; // Counts the  number of ticks done 
  Car[] cars; 
  PitStop pitStop;
  FinishLine finishLine;
  int pitStopLocation; 
  /**
   * DO NOT REMOVE THIS - you should be using this to log this track's events. For more see the assignment PDF / documentation for TrackLoggerB.java
   */
  private TrackLoggerC logger;
    
  /**
   * Constructs a RaceTrack with no cars and initializes the pit stop, finish position, and tick count.
   */
  public RaceTrack() {
    logger = new TrackLoggerC(); // DO NOT REMOVE THIS LINE
    cars = new Car[0];
    setCars(cars);
    pitStop = new PitStop();
    finishposition = 0;
    ticks = 0;
  }
    
  /**
   * Sets the cars array with the provided array of cars and initializes the finish line.
   * @param cars The array of cars to set on the track.
   */
  public void setCars(Car[] cars) {
    this.cars = new Car[cars.length];
    for (int i = 0; i < cars.length; i++) {
      this.cars[i] = cars[i];
    }
    
    finishLine = new FinishLine(cars);
  }
    
  /**
   * Advances the state of the race by one tick, moving cars, handling pit stops, and checking for collisions.
   */
  public void tick() {
	// Handle movement Car and pit stops
    for (int i = 0; i < cars.length; i++) {
      if (pitStop.getCarsInPitStop()[i] == 0 && !cars[i].getFinished()) {
        if (cars[i].getDamaged() && cars[i].getLocation() % 100 < 75) {
          pitStopLocation = ((int)(cars[i].getLocation() / 100) * 100) + 75; 
        } else if (cars[i].getDamaged() && cars[i].getLocation() % 100 > 75) {
          pitStopLocation = ((int)((cars[i].getLocation() + 100) / 100) * 100) + 75;
        } 

        cars[i].move();
     // Enter pit stop if damaged and at the pit stop location
        if ((cars[i].getLocation() >= pitStopLocation) 
              && cars[i].getDamaged()) {
          pitStop.enterPitStop(cars[i], i, pitStopLocation);
          logger.logEnterPit(cars[i]);
        }
          
        // Finish the race if the car reaches or exceeds the finish line
        if (cars[i].getLocation() >= 1000) {
          finishLine.enterFinishLine(cars[i]);
          logger.logFinish(cars[i], ++finishposition);
        }
      }
    }
      
 // Handle exit of Cars from pit stops
    for (int  i = 0; i < pitStop.getCarsInPitStop().length; i++) {
      if (pitStop.getCarsInPitStop()[i] == 3) {
        logger.logExitPit(cars[i]);
        pitStop.exitPitStop(i);
        cars[i].move();
       
        if (cars[i].getLocation() >= 1000) {
          finishLine.enterFinishLine(cars[i]);
          logger.logFinish(cars[i], ++finishposition);
        }
      } else if (pitStop.getCarsInPitStop()[i] == 1 
          || pitStop.getCarsInPitStop()[i] == 2) {
        pitStop.moveTickPitStop(i);
      }
    }
      
 // Check for collisions between cars
    checkCollision();
  }
    

  /**
  * Checks for collisions between cars on the track and logs any damages.
  */
  public void checkCollision() {
      
	// Check collisions among Cars
    if (cars.length > 1) {
      for (int  i = 0; i < cars.length; i++) {
        for (int j = 0; j < cars.length; j++) {
          if (!(j == i)) { 
            if (cars[i].getLocation() % 100 == cars[j].getLocation() % 100 
                && pitStop.getCarsInPitStop()[i] == 0 
                && pitStop.getCarsInPitStop()[j] == 0
                && !cars[i].getFinished()
                && !cars[j].getFinished()){
             
              if (cars[i].getDamaged() == false) {
                logger.logDamaged(cars[i]);
                cars[i].setDamaged(true);
              }
              if (cars[j].getDamaged() == false) {
                logger.logDamaged(cars[j]);
                cars[j].setDamaged(true);
              }
            }
          }
        }
      }
    }
  }
    
  /**
   * Runs the race by advancing the state by one tick until all cars have finished, and calculates the final score.
   */
  public void run() {
    while (!finishLine.finished()) {
      logger.logNewTick();
      tick();
      ticks++;
    }
    calculatorScore(ticks);
  }
  /**
   * Calculates the final score based on the number of ticks and the number of cars.
   * @param ticks The number of ticks taken to complete the race.
   * @return The final score.
   */
  public int calculatorScore(int ticks) {
    int countRaceCars = 0;
    int countFormulaOnes = 0;
    int countSportsCars = 0;
    for (int i = 0; i < cars.length; i++) {
      if (cars[i] instanceof RaceCar) {
        countRaceCars++;
      } else if (cars[i] instanceof FormulaOne) {
        countFormulaOnes++;
      } else {
        countSportsCars++;
      }
    }

    int score = 1000 - (20 * ticks) + (150 * countRaceCars) + (100 * countFormulaOnes) + (200 * countSportsCars);
    logger.logScore(score);
    return score;
  }
    
  /**
   * This method returns the logger instance used by this RaceTrack. You <b>SHOULD NOT</b> be using this method. 
   * @return logger with this track's events 
   */
  public TrackLoggerC getLogger() {
      return logger;
  } 
}
