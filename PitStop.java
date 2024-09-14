package main;
/**
 * Represents a pit stop area where cars can enter, get serviced, and exit.
 */
public class PitStop {
  private int[] carsInPitStop; // Array to track the number of cars in the pit stop
    
  /**
   * Default constructor for PitStop class.
   */
  public PitStop() {
    carsInPitStop = new int[10]; //Initializes the array to track cars in the pit stop (assuming there are 10 slots).
  }
    
  /**
   * Method to make a car enter the pit stop, updates the pit stop array and sets car properties.
   * @param car The car entering the pit stop.
   * @param i Index indicating index of the car.
   * @param pitStopLocation The location of the pit stop.
   */
  public void enterPitStop(Car car, int i, int pitStoplocation) { 
    carsInPitStop[i]++;
    car.setLocation(pitStoplocation);
    car.setDamaged(false);
  }
    
  /**
   * Method to simulate a tick in the pit stop, updating the pit stop array.
   * @param i Index of the car.
   */ 
  public void moveTickPitStop(int i) { 
    carsInPitStop[i]++;
  }
 
  /**
   * Method to make a car exit the pit stop, updating the pit stop array.
   * @param i Index of the car.
   */
  public void exitPitStop(int i) { 
    carsInPitStop[i] = 0;
  }

  /**
   * Getter method to retrieve the array representing cars in the pit stop.
   * @return The array representing cars in the pit stop.
   */
  public int[] getCarsInPitStop() {
    return carsInPitStop;
  }
}
