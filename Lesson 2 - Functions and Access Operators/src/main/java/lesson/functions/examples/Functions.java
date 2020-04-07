package lesson.functions.examples;

@SuppressWarnings("unused")
public class Functions {
    double functionName(double param) {
        double square = param * param;
        double half = param / 2;

        return square + half;
    }

    void functionName() {
        // do something
        // do something else
        // ...

        return;
        // inaccessible code
    }

    int counter = 0;

    double someComplexFunction() {
        counter = counter + 1;

        double a = 5;
        double b = 3;

        return someOtherFunction(a, b);
    }

    double someOtherFunction(double first, double second) {
        return first - second;
    }

    double caller() {
        voidFunction();

        double x = otherFunction(3, 6);
        double y = otherFunction(x, 5);

        return x + y;
    }

    void voidFunction() {
        // do something...
    }

    double otherFunction(double a, double b) {
        return a - b;
    }
}