package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.*;

/**
 * This logger will be used by the RaceTrack to record all events that occur during the race. This class will handle printing
 /
public class TrackLoggerC {

	/**
	 * List of Sets of events that occur at each tick.	
	 */
	private List<Set<String>> tickOutputs;

	/**
	 * Constructs a logger for the beginning of the race. 
	 */
	public TrackLoggerC() {
		tickOutputs = new ArrayList<Set<String>>();
	}
	
	
	public void logNewTick() {
		tickOutputs.add(new HashSet<String>());
		System.out.println("Tick " + tickOutputs.size());
	}

	/**
	 * Logs that a car has entered a pitstop in the current tick & prints this to the console.
	 * @param car a RaceCar entering a PitStop 
	 */
	public void logEnterPit(RaceCar car) {
		tickOutputs.get(tickOutputs.size() - 1).add(enterPitStr(car));
		System.out.println(enterPitStr(car));
	}
	
	/**
	 * Logs that a car has exited a pitstop in the current tick & prints this to the console.
	 * @param car a RaceCar exiting a PitStop 
	 */
	public void logExitPit(RaceCar car) {
		tickOutputs.get(tickOutputs.size() - 1).add(exitPitStr(car));
		System.out.println(exitPitStr(car));
	}
	
	/**
	 * Logs that a car has been damaged in the current tick & prints this to the console.
	 * @param car a RaceCar that's been damaged 
	 */
	public void logDamaged(RaceCar car) {
		tickOutputs.get(tickOutputs.size() - 1).add(damagedStr(car));
		System.out.println(damagedStr(car));
	}
	
	/**
	 * Logs that a car has finished the race in a certain place in the current tick & prints this to the console.
	 * @param car a RaceCar entering a PitStop 
	 * @param place the place 'car' finished in 
	 */
	public void logFinish(RaceCar car, int place) {
		tickOutputs.get(tickOutputs.size() - 1).add(finishedStr(car, place));
		System.out.println(finishedStr(car, place));
	}
	
	/**
	 * Logs that a RaceTrack finished a race with a given score. 
	 * @param pts the number of points as a result of the race lasting some no. of ticks, with some no. of cars, etc. 
	 */
	public void logScore(int pts) {
		tickOutputs.get(tickOutputs.size() - 1).add(scoreStr(pts));
		System.out.println("\n" + scoreStr(pts));
	}
	

	/**
	 * Logs that a car has entered a pitstop in the current tick & prints this to the console.
	 * @param car a FormulaOne entering a PitStop 
	 */
	public void logEnterPit(FormulaOne car) {
		tickOutputs.get(tickOutputs.size() - 1).add(enterPitStr(car));
		System.out.println(enterPitStr(car));
	}
	
	/**
	 * Logs that a car has entered a pitstop in the current tick & prints this to the console.
	 * @param car a SportsCar entering a PitStop 
	 */
	public void logEnterPit(SportsCar car) {
		tickOutputs.get(tickOutputs.size() - 1).add(enterPitStr(car));
		System.out.println(enterPitStr(car));
	}
	
	/**
	 * Logs that a car has entered a pitstop in the current tick & prints this to the console.
	 * @param car a Car entering a PitStop 
	 */
	public void logEnterPit(Car car) {
		tickOutputs.get(tickOutputs.size() - 1).add(enterPitStr(car));
		System.out.println(enterPitStr(car));
	}
	
	/**
	 * Logs that a car has exited a pitstop in the current tick & prints this to the console.
	 * @param car a FormulaOne exiting a PitStop 
	 */
	public void logExitPit(FormulaOne car) {
		tickOutputs.get(tickOutputs.size() - 1).add(exitPitStr(car));
		System.out.println(exitPitStr(car));
	}
	
	/**
	 * Logs that a car has exited a pitstop in the current tick & prints this to the console.
	 * @param car a SportsCar exiting a PitStop 
	 */
	public void logExitPit(SportsCar car) {
		tickOutputs.get(tickOutputs.size() - 1).add(exitPitStr(car));
		System.out.println(exitPitStr(car));
	}
	
	/**
	 * Logs that a car has exited a pitstop in the current tick & prints this to the console.
	 * @param car a Car exiting a PitStop 
	 */
	public void logExitPit(Car car) {
		tickOutputs.get(tickOutputs.size() - 1).add(exitPitStr(car));
		System.out.println(exitPitStr(car));
	}
	
	/**
	 * Logs that a car has been damaged in the current tick & prints this to the console.
	 * @param car a FormulaOne that's been damaged 
	 */
	public void logDamaged(FormulaOne car) {
		tickOutputs.get(tickOutputs.size() - 1).add(damagedStr(car));
		System.out.println(damagedStr(car));
	}
	
	/**
	 * Logs that a car has been damaged in the current tick & prints this to the console.
	 * @param car a SportsCar that's been damaged 
	 */
	public void logDamaged(SportsCar car) {
		tickOutputs.get(tickOutputs.size() - 1).add(damagedStr(car));
		System.out.println(damagedStr(car));
	}

	/**
	 * Logs that a car has been damaged in the current tick & prints this to the console.
	 * @param car a Car that's been damaged 
	 
	 */
	public void logDamaged(Car car) {
		tickOutputs.get(tickOutputs.size() - 1).add(damagedStr(car));
		System.out.println(damagedStr(car));
	}
	
	/**
	 * Logs that a car has finished the race in a certain place in the current tick & prints this to the console.
	 * @param car a FormulaOne entering a PitStop 
	 * @param place the place 'car' finished in 
	 */
	public void logFinish(FormulaOne car, int place) {
		tickOutputs.get(tickOutputs.size() - 1).add(finishedStr(car, place));
		System.out.println(finishedStr(car, place));
	}
	
	/**
	 * Logs that a car has finished the race in a certain place in the current tick & prints this to the console.
	 * @param car a SportsCar entering a PitStop 
	 * @param place the place 'car' finished in 
	 */
	public void logFinish(SportsCar car, int place) {
		tickOutputs.get(tickOutputs.size() - 1).add(finishedStr(car, place));
		System.out.println(finishedStr(car, place));
	}
	
	/**
	 * Logs that a car has finished the race in a certain place in the current tick & prints this to the console.
	 * @param car a car entering a PitStop 
	 * @param place the place 'car' finished in 
	 */
	public void logFinish(Car car, int place) {
		tickOutputs.get(tickOutputs.size() - 1).add(finishedStr(car, place));
		System.out.println(finishedStr(car, place));
	}
	


	/**
	 * Gets the Set of events that occurred at a given tick. 
	 * @param tick some tick 
	 * @return the set of events that occurred at tick no. 'tick' 
	 */
	public Set<String> getTickLog(int tick) {
		return tickOutputs.get(tick - 1);
	}

	/**
	 * Gets the String that is logged as the event of a car being damaged & what is printed to the console 
	 * @param car a car 
	 * @return something like "RaceCar 55/35 has been damaged." 
	 */
	public static String damagedStr(RaceCar car) { 
		return car.toString() + " has been damaged.";
	}

	/**
	 * Gets the String that is logged as the event of a car being damaged & what is printed to the console 
	 * @param car a car 
	 * @return something like "FormulaOne 55/35 has been damaged." 
	 */
	public static String damagedStr(FormulaOne car) { 
		return car.toString() + " has been damaged.";
	}

	/**
	 * Gets the String that is logged as the event of a car being damaged & what is printed to the console 
	 * @param car a car 
	 * @return something like "SportsCar 55/35 has been damaged." 
	 */
	public static String damagedStr(SportsCar car) { 
		return car.toString() + " has been damaged.";
	}

	/**
	 * Gets the String that is logged as the event of a car being damaged & what is printed to the console 
	 * @param car a car 
	 * @return something like "RaceCar 55/35 has been damaged." 
	 */
	public static String damagedStr(Car car) { 
		return car.toString() + " has been damaged.";
	}

	/**
	 * Gets the String that is logged as the event of a car being entered into a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "RaceCar 55/35 has entered the pit stop." 
	 */
	public static String enterPitStr(RaceCar car) {
		return car.toString() + " has entered the pit stop.";
	}

	/**
	 * Gets the String that is logged as the event of a car being entered into a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "FormulaOne 55/35 has entered the pit stop." 
	 */
	public static String enterPitStr(FormulaOne car) {
		return car.toString() + " has entered the pit stop.";
	}

	/**
	 * Gets the String that is logged as the event of a car being entered into a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "SportsCar 55/35 has entered the pit stop." 
	 */
	public static String enterPitStr(SportsCar car) {
		return car.toString() + " has entered the pit stop.";
	}

	/**
	 * Gets the String that is logged as the event of a car being entered into a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "RaceCar 55/35 has entered the pit stop." 
	 */
	public static String enterPitStr(Car car) {
		return car.toString() + " has entered the pit stop.";
	}


	/**
	 * Gets the String that is logged as the event of a car leaving a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "RaceCar 55/35 has exited the pit stop." 
	 */
	public static String exitPitStr(RaceCar car) {
		return car.toString() + " has exited the pit stop.";
	}

	/**
	 * Gets the String that is logged as the event of a car leaving a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "FormulaOne 55/35 has exited the pit stop." 
	 */
	public static String exitPitStr(FormulaOne car) {
		return car.toString() + " has exited the pit stop.";
	}

	/**
	 * Gets the String that is logged as the event of a car leaving a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "SportsCar 55/35 has exited the pit stop." 
	 */
	public static String exitPitStr(SportsCar car) {
		return car.toString() + " has exited the pit stop.";
	}

	/**
	 * Gets the String that is logged as the event of a car leaving a PitStop & what is printed to the console 
	 * @param car a car 
	 * @return something like "RaceCar 55/35 has exited the pit stop." 
	 */
	public static String exitPitStr(Car car) {
		return car.toString() + " has exited the pit stop.";
	}

	/**
	 * Gets the String that is logged as the event of a car finishing the race in some place & what is printed to the console 
	 * @param car a car 
	 * @param place the place 'car' finished in 
	 * @return something like "RaceCar 55/35 has finished the race in place 1." 
	 */
	public static String finishedStr(RaceCar car, int place) {
		return car.toString() + " has finished the race in place " + place + ".";
	}

	/**
	 * Gets the String that is logged as the event of a car finishing the race in some place & what is printed to the console 
	 * @param car a car 
	 * @param place the place 'car' finished in 
	 * @return something like "FormulaOne 55/35 has finished the race in place 1." 
	 */
	public static String finishedStr(FormulaOne car, int place) {
		return car.toString() + " has finished the race in place " + place + ".";
	}

	/**
	 * Gets the String that is logged as the event of a car finishing the race in some place & what is printed to the console 
	 * @param car a car 
	 * @param place the place 'car' finished in 
	 * @return something like "SportsCar 55/35 has finished the race in place 1." 
	 */
	public static String finishedStr(SportsCar car, int place) {
		return car.toString() + " has finished the race in place " + place + ".";
	}

	/**
	 * Gets the String that is logged as the event of a car finishing the race in some place & what is printed to the console 
	 * @param car a car 
	 * @param place the place 'car' finished in 
	 * @return something like "RaceCar 55/35 has finished the race in place 1." 
	 */
	public static String finishedStr(Car car, int place) {
		return car.toString() + " has finished the race in place " + place + ".";
	}

	/**
	 * Gets the String that is logged as the event of a RaceTrack finishing a race with a certain score & what is printed to the console 
	 * @param score a score 
	 * @return something like "You scored 100 points." 
	 */
	public static String scoreStr(int score) {
		return "You scored " + score + " points.";
	}
}
