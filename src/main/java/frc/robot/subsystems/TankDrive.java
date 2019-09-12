/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.motor.TalonSRX;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * Add your docs here.
 */
public class TankDrive extends DriveTrain {
  private TalonSRX left;
  private TalonSRX right;
  public TankDrive(TalonSRX leftMotor, TalonSRX rightMotor) {
    this.left = leftMotor;
    this.right = rightMotor;
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void coast() {
    // TODO Auto-generated method stub
    left.coast();
    right.coast();
  }

  @Override
  public void disableBrownoutProtection() {
    // TODO Auto-generated method stub

  }

  @Override
  public void enableBrownoutProtection() {
    // TODO Auto-generated method stub

  }

  @Override
  public TalonSRX getLeft() {
    // TODO Auto-generated method stub
    return left;
  }

  @Override
  public TalonSRX getRight() {
    // TODO Auto-generated method stub
    return right;
  }

  @Override
  public void set(double speed) {
    // TODO Auto-generated method stub
    left.set(speed);
    right.set(speed);
  }

  @Override
  public void set(double leftSpeed, double rightSpeed) {
    // TODO Auto-generated method stub
    left.set(leftSpeed);
    right.set(rightSpeed);

  }

  @Override
  public void setLeft(double speed) {
    // TODO Auto-generated method stub
    left.set(speed);
  }

  @Override
  public void setRight(double speed) {
    // TODO Auto-generated method stub
    right.set(speed);
  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub
    left.brake();
    right.brake();
  }

  @Override
  public void turnInPlace(boolean right, double speed) {
    // TODO Auto-generated method stub
    if (right){
      set(speed, -speed);
    } else {
      set(-speed, speed);
    }
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }

}
