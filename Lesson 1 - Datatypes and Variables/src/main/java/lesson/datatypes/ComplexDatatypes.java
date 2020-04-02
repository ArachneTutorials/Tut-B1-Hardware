package lesson.datatypes;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Solenoid;

@SuppressWarnings("unused")
public class ComplexDatatypes {
    {
        int canId = 0;
        TalonFX motor = new TalonFX(canId);
    }

    {
        int canId = 0;
        TalonSRX motor = new TalonSRX(canId);

        int pwmId = 0;
        PWMTalonSRX pwmMotor = new PWMTalonSRX(pwmId);

        pwmMotor.close();
    }

    {
        int canId = 0;
        VictorSPX motor = new VictorSPX(canId);

        int pwmId = 0;
        PWMVictorSPX pwmMotor = new PWMVictorSPX(pwmId);

        pwmMotor.close();
    }

    {
        int canId = 1;
        CANSparkMax motor = new CANSparkMax(canId, MotorType.kBrushless);

        int pwmId = 0;
        PWMSparkMax pwmMotor = new PWMSparkMax(canId);

        motor.close();
        pwmMotor.close();
    }

    {
        int solenoidId = 0;
        Solenoid solenoid = new Solenoid(solenoidId);

        solenoid.close();
    }

    {
        int solenoidFwdId = 0;
        int solenoidRevId = 1;
        DoubleSolenoid solenoid = new DoubleSolenoid(solenoidFwdId, solenoidRevId);

        solenoid.close();
    }

    {
        int digitalId = 0;
        DigitalInput digital = new DigitalInput(digitalId);

        int analogId = 0;
        AnalogInput analog = new AnalogInput(analogId);

        digital.close();
        analog.close();
    }
}