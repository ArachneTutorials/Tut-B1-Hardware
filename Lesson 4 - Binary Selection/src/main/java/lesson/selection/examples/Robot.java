package lesson.selection.examples;

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
		if(driverController.getAButton()) {
			leftDriveMotor.set(ControlMode.PercentOutput, 0.5);
		}
		else if(driverController.getBButton()) {
			leftDriveMotor.set(ControlMode.PercentOutput, -0.5);
		}
		else {
			leftDriveMotor.set(ControlMode.PercentOutput, 0);
		}

		rightDriveMotor.set(ControlMode.PercentOutput, driverController.getXButton() ? 0.5 : 0);
    }
}

