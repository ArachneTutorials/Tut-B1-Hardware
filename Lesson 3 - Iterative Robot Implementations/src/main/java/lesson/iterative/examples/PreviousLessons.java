package lesson.iterative.examples;

import java.util.function.DoubleUnaryOperator;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class PreviousLessons {
    // Variables
    double speed = 0.8;
    boolean shouldActivate = true;
    TalonFX motor = new TalonFX(0);

    // Functions
    double square(double value) {
        // Use the dot operator to call a function
        // in a separate file
        return Math.pow(value, 2);
    }

    void increaseSpeed() {
        double amountToIncrease = square(0.4);

        speed += amountToIncrease;

        // Print the speed to the console
        System.out.println(speed);
    }

    // Double colon operator
    DoubleUnaryOperator function = this::square;
    double variable = function.applyAsDouble(5);
}