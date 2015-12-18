package org.usfirst.frc.team4761.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Bounce extends CommandGroup {
    
    public  Bounce() {
    	addParallel(new TheOneCommandToRuleThemAll());
    }
}
