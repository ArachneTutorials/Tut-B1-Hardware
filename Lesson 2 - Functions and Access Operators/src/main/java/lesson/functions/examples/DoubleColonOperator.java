package lesson.functions.examples;

import java.util.function.DoubleBinaryOperator;

@SuppressWarnings("unused")
public class DoubleColonOperator {
    void a() {
        // do something...
    }

    void b() {
        // do something...
    }

    void c() {
        // do something...
    }

    void runFunction(Runnable function) {
        function.run();
    }

    void caller() {
        runFunction(this::a);
        runFunction(this::b);
        runFunction(this::c);
    }

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double binaryOperation(double a, double b, DoubleBinaryOperator operator) {
        return operator.applyAsDouble(a, b);
    }

    void mathCaller() {
        double a = 46;
        double b = 13;

        double aPlusB = binaryOperation(a, b, this::add);
        double aMinusB = binaryOperation(a, b, this::subtract);

        double aToThePowerOfB = binaryOperation(a, b, Math::pow);
    }
}