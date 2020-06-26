package lesson.repetition.tasks;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Tasks {
    // --------------------
    // Section 1
    // --------------------

    // Task 1
    // Complete the function createMotors() that creates and returns an array
    // of 5 TalonFX motors.
    TalonFX[] createMotors() {
        return new TalonFX[0]; // TODO Remove this line
    }

    // Task 2
    // Write a function spinMotors(motors, speed) that takes an array of
    // TalonFX motors and a double speed from -1 to 1, and sets all the motors
    // to that speed.

    // TODO Write the spinMotors(motors, speed) function here

    // Task 3
    // Write a function avg(values) that takes an array of double values
    // and returns their average

    // TODO Write the avg(values) function here

    // --------------------
    // Group problem
    // --------------------

    // In maths, the Collatz conjecture is a famous prediction that if we start
    // from any positive integer n, and then
    // - halve it if it is even
    // - multiply it by 3 then add 1 if it is odd
    // we will eventually arrive at 1.

    // Write a function collatz(n) that takes a positive integer n and prints
    // all the values the Collatz conjecture produces from it until it reaches 1.

    // --------------------
    // Section 2
    // --------------------

    // Task 1
    // Write a function factors(n) that prints the factors of a positive integer n.

    // Task 2
    // Write a function fibonacci(n) that takes a positive integer n and returns
    // an array containing the first n Fibonacci numbers.
    //
    // Note: The first two numbers of the Fibonacci sequence are 1, and each
    // number after that is the sum of the previous 2 numbers. So the beginning
    // of the sequence is [1, 1, 2, 3, 5, 8, 13, ...]
}