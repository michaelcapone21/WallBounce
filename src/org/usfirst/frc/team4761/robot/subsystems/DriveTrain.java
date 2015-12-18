package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Class to represent the drive train.
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    }
    public void stop() {
    	RobotMap.robotDrive.tankDrive( 0.0, 0.0) ;
    }
    public void tankDrive(double arg1, double arg2) {
    	RobotMap.robotDrive.tankDrive(arg1, arg2);
    }
}

