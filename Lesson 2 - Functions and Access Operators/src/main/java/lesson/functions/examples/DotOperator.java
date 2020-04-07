package lesson.functions.examples;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class DotOperator {
    TalonFX leftMotor = new TalonFX(0);
    TalonFX rightMotor = new TalonFX(1);
    
    void runMotors(double speed) {
        leftMotor.set(ControlMode.PercentOutput, speed);
        rightMotor.set(ControlMode.PercentOutput, speed);
    }

    {
        int someVariable = 4613;
        
        System.out.println(someVariable);
    }
}