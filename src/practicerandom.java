package Day5;
import java.lang.Math;
public class practicerandom {
    // Java program to demonstrate working
// of java.lang.Math.random() method



        // driver code
        public static void main(String args[])
        {
            // define the range
            int max = 8;
            int min = 1;
            int range = max - min + 1;

            // generate random numbers within 1 to 10
            for (int i = 0; i < 10; i++)
            {
                int rand = (int)(Math.random() * range) + min;

                // Output is different everytime this code is executed
                System.out.println(rand);              }
        }
    }



