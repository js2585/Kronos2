package frc.robot.motor;

public interface Motor {

	void set(double speed);

	double getPercentSpeed();
	
	void stop();

	void brake();

	void coast();

	// public void setBrakeMode(boolean enable);

	int getChannel();

	boolean isReversed();

    double getCurrent();
}