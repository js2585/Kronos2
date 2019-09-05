package frc.robot.motor;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.interfaces.Gyro;

public class TalonSRX extends com.ctre.phoenix.motorcontrol.can.TalonSRX implements Motor {

    private static final int TIMEOUT_MS = 30;
    Gyro gyro;
    public static final int CURRENT_LIMIT = 41;
    public static final int CURRENT_LIMIT_THRESHOLD = 41;
    public static final int LIMIT_TIMEOUT = 200; // ms

    public TalonSRX(int channel, boolean reversed) {
        super(channel);
        super.setInverted(reversed);
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        this.set(0);
        super.setNeutralMode(NeutralMode.Brake);

    }

    @Override
    public void coast() {
        // TODO Auto-generated method stub
        this.set(0);
        super.setNeutralMode(NeutralMode.Coast);
    }

    @Override
    public int getChannel() {
        // TODO Auto-generated method stub
        return super.getDeviceID();
    }

    @Override
    public double getCurrent() {
        // TODO Auto-generated method stub
        return super.getOutputCurrent();
    }

    @Override
    public double getPercentSpeed() {
        // TODO Auto-generated method stub
        return super.getMotorOutputPercent();
    }

    @Override
    public boolean isReversed() {
        // TODO Auto-generated method stub
        return super.getInverted();
    }

    @Override
    public void set(double speed) {
        // TODO Auto-generated method stub
        if (speed > 1){
            speed = 1;
        }
        if (speed < -1){
            speed = -1;
        }
        super.set(ControlMode.PercentOutput, speed);
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        set(0);
    }

}





