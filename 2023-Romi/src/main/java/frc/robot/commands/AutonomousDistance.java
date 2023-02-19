// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

public class AutonomousDistance extends SequentialCommandGroup{
  /** Creates a new AutonomousDistance. */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
      new DriveDistance(0.5, 10, drivetrain),
      new DriveDistance(-0.5, 10, drivetrain)
    );
    // Use addRequirements() here to declare subsystem dependencies.
  }
}