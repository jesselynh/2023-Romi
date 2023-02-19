// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDrive extends CommandBase {
  private final Drivetrain drivetrain;
  //private final Supplier<Double> xAxisSpeedSupplier;
  //private final Supplier<Double> xAxisSpeedSupplier;
  private final DoubleSupplier xAxisSpeedSupplier;
  private final DoubleSupplier zAxisRotateSupplier;

/**
 * 
 * Creates a new ArcadeDrive.This command will drive your robot according to the speed supplier
 *lambdas. This command does not terminate.
 * @param drivetrain The drivetrain subsystem on which this command will run
 * @param xAxisSpeedSupplier Lambda supplier of forward/backward speed, -1 to 1
 * @param zAxisSpeedSupplier Lambda supplier of rotational speed, -1 to 1 
 * 
 */

  public ArcadeDrive(Drivetrain drivetrain, DoubleSupplier xAxisSpeedSupplier, DoubleSupplier zAxisSpeedSupplier) {
    this.drivetrain = drivetrain;
    this.xAxisSpeedSupplier = xAxisSpeedSupplier;
    this.zAxisRotateSupplier = zAxisSpeedSupplier;
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.arcadeDrive(xAxisSpeedSupplier.getAsDouble(), zAxisRotateSupplier.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
