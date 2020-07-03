package lesson.text.examples;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import arachne.lib.immutables.DoublePair;

public class Text {
    // Chars
    {
        // Prints the character a
        char c1 = 'a';
        System.out.println(c1);

        // Prints the character b
        char c2 = 'b';
        System.out.println(c2);

        // Also prints the character b
        char c3 = 'a' + 1;
        System.out.println(c3);
    }

    // Special characters
    {
        // Prints a tab
        char c1 = '\t';
        System.out.println(c1);

        // Prints a newline
        char c2 = '\n';
        System.out.println(c2);

        // Prints the greek character Ω
        char c3 = '\u03A9';
        System.out.println(c3);

        // Also prints the character Ω
        char c4 = 'Ω';
        System.out.println(c4);
    }

    // Hexadecimal
    {
        // Prints 39612
        int a = 0x9ABC;
        System.out.println(a);

        // Prints 255
        int b = 0xFF;
        System.out.println(b);

        // What does this print?
        System.out.println(0xC8B4);
    }

    // Strings
    {
        String s1 = "Hello";
        System.out.println(s1);

        String s2 = "Captial omega: \u03A9";
        System.out.println(s2);

        String s3 = "Line 1\nLine 2";
        System.out.println(s3);
    }

    // String operations
    {
        // Concatenation
        String s1 = "Hello" + " World";
        String s2 = "Capital omega: " + '\u03A9';
        String s3 = "Capital omega: " + "\u03A9";

        String allOfTheAbove = s1 + s2 + s3;
        System.out.println(allOfTheAbove);

        // Length
        int totalLength = allOfTheAbove.length();
        System.out.println(totalLength);

        // Access by index
        char c = allOfTheAbove.charAt(10);
        System.out.println("Value of c: " + c);

        // Extract subsection
        int begin = 5;
        int end = 16;
        String s4 = allOfTheAbove.substring(begin, end);
        System.out.println(s4);
    }

    // Adding other types
    {
        double x = 3.14;
        System.out.println("x is " + x);

        boolean b = true && (false || !true);
        System.out.println("b: " + b);

        System.out.println("x: " + x + ", b: " + b);

        // Prints the string representation of a complex
        // datatype if defined, or the type and memory
        // address otherwise
        DoublePair pair = new DoublePair(3.14, 2.718);
        String s = pair.toString();
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Text();
    }
}