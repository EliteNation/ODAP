/*
 * Object Detection and Avoidance Program
 * --------------------------------------
 * 
 * This project may be found under ODAP: https://github.com/EliteNation/ODAP
 * 
 * Laws and Agreement of usage may be found under: https://github.com/EliteNation/Laws
 */
package utility.math.algebra;

/**
 *
 * @author Caleb
 */
public class Math {
    //===========================
    //Square
    //===========================
    
        //non-decimal 8 bit
        public static int square(byte number){
            return (number * number);
        }

        //non-decimal 16 bit
        public static int square(short number){
            return (number * number);
        }

        //non-decimal 32 bit
        public static int square(int number){
            return (number * number);
        }

        //non-decimal 64 bit
        public static long square(long number){
            return (number * number);
        }

        //decimal 32 bit
        public static float square(float number){
            return (number * number);
        }

        //decimal 64 bit
        public static double square(double number){
            return (number * number);
        }
    
    //===========================
    //Square Root
    //===========================
    
    //if int, separate in groups of 2 from right to left
    
    //if decimal, separate in groups of 2 from right to left, starting from the decimal point
    
    public static int squareRoot(int number){
        return 0;
    }
}
