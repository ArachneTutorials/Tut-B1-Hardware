package lesson.selection.examples;

import edu.wpi.first.wpilibj.XboxController;

public class Selection {
    void basicIfElse() {
        boolean condition = true;

        if(condition) {
            // do one thing
        }
        else {
            // do another thing
        }
    }

    void conditions() {
        // Using combinations of booleans
        boolean a = true;
        boolean b = false;
        boolean c = false;

        if((a || b) && !c) {
            // do something
        }

        // Using the result of a function that returns a boolean
        XboxController controller = new XboxController(0);
        
        if(controller.getAButton()) {
            // do something
        }
    }

    void comparisons() {
        double a = 46;
        double b = 13;

        if(a == b) {
            // do something
        }

        if(a >= b * 5) {
            // do something
        }

        if(a != b && a % b % 2 != 0) {
            // do something
        }
    }

    void nesting() {
        double a = 46;
        double b = 13;
        double c = 3.14;

        if(a >= b) {
            // do something

            if(b != c) {
                // do something
            }
            else {
                // do something else
            }
        }
    }

    void elseIf() {
        int a = 0;

        if(a < 2) {
            // do something
        }
        else if(a == 2) {
            // do something else
        }
        else if(a == 3) {
            // do a third thing
        }
        else {
            // a must be > 3
        }
    }

    void elseIfEquivalent() {
        int a = 0;

        if(a < 2) {
            // do something
        }
        else {
            if(a == 2) {
                // do something else
            }
            else {
                if(a == 3) {
                    // do a third thing
                }
                else {
                    // a must be > 3
                }
            }
        }
    }

    @SuppressWarnings("unused")
    void ternary() {
        boolean condition = true;
        double value = condition ? 46 : 13;
    }

    @SuppressWarnings("unused")
    void ternaryEquivalent() {
        boolean condition = true;
        double value;

        if(condition) {
            value = 46;
        }
        else {
            value = 13;
        }
    }
}