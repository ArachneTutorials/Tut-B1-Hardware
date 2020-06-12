package lesson.iterative.examples;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import arachne.lib.ArachneRobot;
import arachne.lib.game.GameState;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends ArachneRobot {
    // Motors
	TalonFX rightDriveMotor = new TalonFX(0);
	TalonFX rightDriveSlave = new TalonFX(1);

	TalonFX leftDriveMotor = new TalonFX(2);
	TalonFX leftDriveSlave = new TalonFX(3);

    // Joysticks
    XboxController driverController = new XboxController(0);

    public static void main(String[] args) {
		startRobot(Robot::new);
    }
    
    @Override
	protected void initialize() {
		// Slave motors
		rightDriveSlave.follow(rightDriveMotor);
		leftDriveSlave.follow(leftDriveMotor);

		// Invert motors
		rightDriveMotor.setInverted(true);
		rightDriveSlave.setInverted(true);
	}
	
	@Override
	protected void onStateChange(GameState oldState, GameState newState) {
	}

	@Override
	protected void execute(GameState state) {
		// Arcade-drive
		double speed = -driverController.getRawAxis(5);
		double rotation = driverController.getRawAxis(0);

		leftDriveMotor.set(ControlMode.PercentOutput, speed + rotation);
		rightDriveMotor.set(ControlMode.PercentOutput, speed - rotation);
    }
}

