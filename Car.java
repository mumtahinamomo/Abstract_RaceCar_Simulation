package main;
/**
 * Abstract class representing a generic car.
 */
public abstract class Car {
  private int speed;
  private int strength;
  private int location; 
  private boolean isDamaged; 
  private boolean isFinished;
  private int DAMAGED_SPEED;
  /**
   * Default constructor for Car class.
   */
  public Car() {
    this.speed = 0;
    this.strength = 0;
    DAMAGED_SPEED = 0;
    this.isFinished = false;
    this.location = 0;
    this.isDamaged = false;
  }
  
  /**
   *Constructor (parameter) for Car class.
   * Initializes attributes with specified speed and strength values.
   * @param speed The speed value of the car.
   * @param strength The strength value of the car.
   */
  public Car(int speed, int strength) {
    this.speed = speed;
    this.strength = strength;
    this.isFinished = false;
    this.location = 0;
    this.isDamaged = false;
  }
  
  /**
   * Sets the speed of the car.
   * @param speed The new speed value to set.
   */
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  
  /**
   * Gets the speed of the car.
   * @return The current speed of the car.
   */
  public int getSpeed() {
    return this.speed;
  }
  
  /**
   * Sets the strength of the car.
   * @param strength The new strength value to set.
   */
  public void setStrength(int strength) {
    this.strength = strength;
  }
  
  /**
   * Gets the strength of the car.
   * @return The current strength of the car.
   */
  public int getStrength() {
    return this.strength;
  }
  
  /**
   * Sets the damaged status of the car.
   * @param isDamaged The new damaged status to set.
   */
  public void setDamaged(boolean isDamaged) {
	    this.isDamaged = isDamaged;
	  }
  
  /**
   * Sets the damaged speed of the car.
   * @param damagedSpeed The new damaged speed value to set.
   */
  public void setDamagedSpeed(int damagedSpeed) {
    this.DAMAGED_SPEED = damagedSpeed;
  }


  /**
   * Gets the damaged status of the car.
   * @return True if the car is damaged, otherwise false.
   */
  public boolean getDamaged() {
	    return this.isDamaged;
	  }
	  
  /**
   * Moves the car based on its current status.
   * If the car is damaged, moves it using the damaged speed, otherwise, moves it using the regular speed.
   */
  public void move() {
    if (isDamaged) {
      this.location += DAMAGED_SPEED;
      }
    else {
      this.location += this.speed;
    }
  }
  

  /**
   * Gets the current location of the car.
   * @return The current location of the car.
   */
  public double getLocation() {
      return this.location;
  }
  
  /**
   * Sets the location of the car.
   * @param location The new location value to set.
   */
  public void setLocation(int location) {
    this.location = location;
  }
  
  /**
   * Sets the finished status of the car.
   * @param isFinished The new finished status to set.
   */
  public void setFinished(boolean isFinished) {
    this.isFinished = isFinished;
  }
  
  /**
   * Gets the finished status of the car.
   * @return True if the car has finished the race, otherwise false.
   */
  public boolean getFinished() {
    return this.isFinished;
  }
}

