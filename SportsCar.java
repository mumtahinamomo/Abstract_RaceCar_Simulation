package main;
/**
 * SportsCar class represents a specialized type of car designed for high performance.
 * Extends the Car class.
 */
public class SportsCar extends Car {
	/**
     * Default constructor for SportsCar class.
     */
  public SportsCar() {
    super(30, 2); //Initializes speed to 30 and strength to 2
    setDamagedSpeed(getSpeed() - (getStrength() * 5)); // Calculates damaged speed 
  }
  
  /**
  * Constructor (parameter) for SportsCar class.
  * Checks input speed and strength, ensuring they are within acceptable ranges.
  * Calculates and sets damaged speed based on validated values.
  * 
  * @param speed The speed value of the sports car.
  * @param strength The strength value of the sports car.
  */
  public SportsCar(int speed, int strength) {
	    super(checkSpeed(speed), checkStrength(strength));
	    setDamagedSpeed(calculateDamagedSpeed());
	}
  /**
   * Checks the speed value to ensure it is within an acceptable range.
   * @param speed The speed value to validate.
   * @return The accepted speed value.
   */
  public static int checkSpeed(int speed) {
	    if (speed > 45) {
	        return 45;
	    } else if (speed < 20) {
	        return 20;
	    }
	    return speed;
	}
  /**
   * Checks the strength value to ensure it is within an acceptable range.
   * @param strength The strength value to validate.
   * @return The accepted strength value.
   */
   public static int checkStrength(int strength) {
	    if (strength > 3) {
	        return 3;
	    } else if (strength < 1) {
	        return 1;
	    }
	    return strength;
	}

   /**
    * Calculates the damaged speed of the sports car depending on its speed and strength.
    * @return The damaged speed value.
    */
   public int calculateDamagedSpeed() {
	    return getSpeed() - (getStrength() * 5);
	}


   /**
    * Returns a string representation of the SportsCar object.
    * 
    * @return A string representation of the object.
    */
  public String toString() {
    return "SportsCar" + getSpeed() + "/" + getStrength();
  }
}
