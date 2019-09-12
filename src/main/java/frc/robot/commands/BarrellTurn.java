/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import edu.wpi.first.wpilibj.interfaces.Gyro;
import frc.robot.Robot;
import frc.robot.motor.TalonSRX;
import frc.robot.subsystems.Barrell;

public class BarrellTurn extends Command {
  private TalonSRX motor;
  private int numBarrells;
  Gyro gyro;
  public BarrellTurn(TalonSRX motor, int numBarrells) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.motor = motor;
    this.numBarrells = numBarrells;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.barrell.RotateBarrell();

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return gyro.getAngle() > (360 / (double)numBarrells);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    motor.brake();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
