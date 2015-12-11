package org.usfirst.frc.team4761.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static Victor frontLeft = new Victor(1);
	public static Victor frontRight = new Victor(2);
	public static Victor rearLeft = new Victor (3);
	public static Victor rearRight = new Victor (4); 
	public static RobotDrive myDrive = new RobotDrive(frontLeft, frontRight, rearLeft, rearRight);
	public static RobotDrive robotDrive = new RobotDrive(1, 2, 3, 4);
}
