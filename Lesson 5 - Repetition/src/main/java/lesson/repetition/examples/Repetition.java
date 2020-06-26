package lesson.repetition.examples;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

@SuppressWarnings("unused")
public class Repetition {
    {
        // --------------------
        // Arrays
        // --------------------
        
        // Initialisation
        // Formats:
        // - datatype[] arrayName = new datatype[length];
        // - datatype[] arrayName = {
        //       val0,
        //       val1,
        //       val2
        //   };
        // - datatype[] arrayName = new datatype[] {
        //       val0,
        //       val1,
        //       val2
        //   };
        int[] array = new int[5];
        
        TalonFX[] motors = {
            new TalonFX(10),
            new TalonFX(11),
            new TalonFX(12)
        };

        // Accessing and modification
        // Format: arrayName[index]
        array[0] = 5;
        array[1] = 8;
        array[2] = array[0] + array[1];

        // Retrieving the length of an array
        // Format: arrayName.length
        int n = motors.length;
    }

    {
        // --------------------
        // For-each
        // --------------------

        // Calculating the sum of an array
        int[] array = {
            3,
            1,
            4,
            1,
            5
        };

        int sum = 0;

        for(int value : array) {
            sum += value;
        }
    }

    {
        // --------------------
        // While
        // --------------------

        // Print and divide a number while it is divisible by 2
        int val = 96;

        while(val % 2 == 0) {
            System.out.println(val);
            val /= 2;
        }

        // Run forever
        // while(true) {
        //     // Do something
        // }
    }

    {
        // --------------------
        // For
        // --------------------

        // Print the numbers from 1 to 10
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Print all even-indexed values in an array
        int[] a = {
            2,
            7,
            1,
            8,
            2,
            8
        };

        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}