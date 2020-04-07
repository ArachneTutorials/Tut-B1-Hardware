package lesson.functions.tasks;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

public class Tasks {
    // --------------------
    // Section 1
    // --------------------

    // Task 1
    // Complete the function add(a, b) to add two double inputs
    // and return the result
    double add(double a, double b) {
        return 0; // Remove this line
    }

    // Task 2
    // Write a function cube(x) which raises x to the power of 3
    // and returns the result

    // Task 3
    // Call the below function operateOn with values of 4, 6, 1 and 3,
    // and return the product of the results
    double myFunction() {
        return 0; // Remove this line
    }

    /**
     * Don't modify this function
     * Should be called during task 3
     */
    double operateOn(int value) {
        return (value * 4613 | 1772 << 3) / 5800d;
    }
    
    // --------------------
    // Section 2
    // --------------------

    // Task 1
    // Use the dot operator to access the cos function in Math.java
    // and return the result of cos(a)
    double cos(double a) {
        return 0; // Remove this line
    }

    // Task 2
    // Print 4613 to the console
    void task2() {

    }

    // Task 3
    // Write a function mod(a, b), then call operateOn2 with a reference to
    // your function as the parameter. Return the result.
    double task3() {
        return 0; // Remove this line
    }

    /**
     * Don't modify this function
     * Should be called during task 3
     */
    double operateOn2(DoubleBinaryOperator operator) {
        return 1.772 * operator.applyAsDouble(4.6, 1.3) + (5800 | 3);
    }

    // Task 4
    // Return a functional reference to System.out.println
    DoubleConsumer task4() {
        return null; // Remove this line
    }
}