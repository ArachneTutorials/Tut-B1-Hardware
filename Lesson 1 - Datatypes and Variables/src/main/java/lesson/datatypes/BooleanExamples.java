package lesson.datatypes;

@SuppressWarnings("unused")
public class BooleanExamples {
    {
        boolean x = !false;
    }

    {
        boolean a = true && false;
        boolean b = true || false;
        boolean x = !(a || b);
    }

    {
        boolean a = true;
        boolean b = false;
        boolean x = (a || b) && !(a && b);
    }
}