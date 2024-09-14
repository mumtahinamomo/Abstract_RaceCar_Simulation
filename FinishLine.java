package main;
public class FinishLine {
  private Car[] cars; // Array to hold cars approaching the finish line
  /**
   * Constructor for FinishLine class and initializes the array of cars
   * @param cars The array of cars approaching the finish line.
   */
  public FinishLine(Car[] cars) {
    this.cars = cars;
  }
  
  /**
   * Marks a car as finished when it crosses the finish line
   * @param car The car that crosses the finish line.
   */
  public void enterFinishLine(Car car) {
    car.setFinished(true); 
  }
    
  /**
   * Checks if all cars have finished the race.
   * @return True if all cars have finished, otherwise false.
   */
  public boolean finished() {
    for (int i = 0; i < cars.length; i++) {
      if (!this.cars[i].getFinished()) {
        return false;
      }
    }
    return true;
  }
}

