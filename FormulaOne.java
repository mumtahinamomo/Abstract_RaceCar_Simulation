package main;

/**
 * Default constructor for FormulaOne car.
 */
public class FormulaOne extends Car {
  
  public FormulaOne() {
    super(50, 4); //Initializes speed to 50 and strength to 4
    setDamagedSpeed(getSpeed() - (getStrength() * 5)); //calculates damaged speed
  }
  /**
   * Constructor (parameter) for FormulaOne class.
   * Initializes speed and strength with the provided values, then limits them to acceptable ranges and calculates damaged speed based on validated values.
   * @param speed The speed value of the Formula One car.
   * @param strength The strength value of the Formula One car.
   */
  public FormulaOne(int speed, int strength) {
	    super(speed, strength);
	    checkSpeed();
	    checkStrength();
	    calculateDamagedSpeed();
	}
  /**
   * Checks and limits the speed of the Formula One car within an acceptable range.
   */
  public void checkSpeed() {
	    int speed = getSpeed();
	    if (speed > 70) {
	        setSpeed(70);
	    } else if (speed < 30) {
	        setSpeed(30);
	    }
	}
  /**
   * Checks and limits the strength of the Formula One car within an acceptable range.
   */
  public void checkStrength() {
	    int strength = getStrength();
	    if (strength > 5) {
	        setStrength(5);
	    } else if (strength < 3) {
	        setStrength(3);
	    }
	}
  /**
   * Calculates the damaged speed of the Formula One car.
   */
  public void calculateDamagedSpeed() {
	    setDamagedSpeed(getSpeed() - (getStrength() * 5));
	}

    
  /**
   * Returns a string representation of the FormulaOne object.
   * @return A string representation of the object.
   */
   public String toString() {
    return "FormulaOne" + getSpeed() + "/" + getStrength();
  }
}
