/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.BarrellTurn;
import frc.robot.motor.TalonSRX;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * Add your docs here.
 */
public class Barrell extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX barrellMotor;
  private TalonSRX barrellLiftMotor;
  private int numBarrells;
  Gyro gyro;
  public Barrell(TalonSRX barrellMotor, TalonSRX barrellLiftMotor, int numBarrells){
    this.barrellMotor = barrellMotor;
    this.barrellLiftMotor = barrellLiftMotor;
    this.numBarrells = numBarrells;
  }

  public void RotateBarrell(){
    barrellMotor.set(0.5);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
