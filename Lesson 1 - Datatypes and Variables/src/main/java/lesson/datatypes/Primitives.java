package lesson.datatypes;

public class Primitives {
    // Booleans
    boolean a = true;
    boolean b = false;

    boolean aAndB = a && b;
    boolean aOrB = a || b;
    boolean notA = !a;

    boolean aXorB = (a || b) && !(a && b);

    // Doubles
    double c = 3.14; // or c = 3.14d
    double d = -2.718; // or d = -2.718d

    // Ints
    int e = 46;
    int f = -13;

    // Floats
    float g = 3.14f; // NOT g = 3.14
    float h = -2.718f; // NOT h = -2.718

    // Numbers
    int s = 46 + 13; // Result is 59
    int t = s - 60; // Result is -1
    int u = s * t; // Result is -59

    int v = 1 / 2; // Result is 0
    double w = 1d / 2d; // Result is 0.5

    int x = 7 % 4; // Result is 3
    int y = -5 % 3; // Result is -2
    double z = 4.6 % 1.3; // Result is 0.7

    public static void main(String[] args) {
        System.out.println();
    }
}