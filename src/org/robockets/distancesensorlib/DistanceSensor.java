package org.robockets.distancesensorlib;

import edu.wpi.first.wpilibj.AnalogInput;

/**
 * Represents a distance sensor. Extend this if you are making a class for a
 * new distance sensor
 */
public abstract class DistanceSensor {
	protected AnalogInput sensor;
	
	/**
	 * If you try to make an instance of DistanceSensor anywhere, Eclipse will
	 * tell you to change the visibility of this constructor to public. DO NOT
	 * DO THIS. Use a subclass of this class instead.
	 *
	 * @param sensor The AnalogInput object that is configured to the port the
	 *               sensor is on
	 */
	protected DistanceSensor(AnalogInput sensor) {
		this.sensor = sensor;
	}
	
	/**
	 * @return {@link edu.wpi.first.wpilibj.AnalogInput AnalogInput} instance
	 * for the distance sensor.
	 */
	protected AnalogInput getAnalogInput() {
		return this.sensor;
	}
	
	/**
	 * @return Distance in centimeters the sensor is from the closest object it
	 * can detect
	 */
	public abstract double getDistanceCentimeters();
	
	/**
	 * @return Distance in inches the sensor is from the closest object it
	 * can detect
	 */
	public abstract double getDistanceInches();
}