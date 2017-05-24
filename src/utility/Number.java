/*
 * Object Detection and Avoidance Program
 * --------------------------------------
 * 
 * This project may be found under ODAP: https://github.com/EliteNation/ODAP
 * 
 * Laws and Agreement of usage may be found under: https://github.com/EliteNation/Laws
 */
package utility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caleb
 */
public class Number {
    //===========================
    //Separate characters (Lists)
    //===========================
        //numbers non-decimal 8 bit
        public static List<Character> charSeparateToList(byte number){
            List<Character> list = new ArrayList<>();

            for (char c : Byte.toString(number).toCharArray()){
                list.add(c);
            }

            return list;
        }
        
        //numbers non-decimal 16 bit
        public static List<Character> charSeparateToList(short number){
            List<Character> list = new ArrayList<>();

            for (char c : Short.toString(number).toCharArray()){
                list.add(c);
            }

            return list;
        }
        
        //numbers non-decimal 32 bit
        public static List<Character> charSeparateToList(int number){
            List<Character> list = new ArrayList<>();

            for (char c : Integer.toString(number).toCharArray()){
                list.add(c);
            }

            return list;
        }
        
        //numbers non-decimal 64 bit
        public static List<Character> charSeparateToList(long number){
            List<Character> list = new ArrayList<>();

            for (char c : Long.toString(number).toCharArray()){
                list.add(c);
            }

            return list;
        }
        
        //numbers decimal 32 bit
        public static List<Character> charSeparateToList(float number){
            List<Character> list = new ArrayList<>();

            for (char c : Float.toString(number).toCharArray()){
                list.add(c);
            }

            return list;
        }
        
        //numbers decimal 64 bit
        public static List<Character> charSeparateToList(double number){
            List<Character> list = new ArrayList<>();

            for (char c : Double.toString(number).toCharArray()){
                list.add(c);
            }

            return list;
        }

        //strings
        public static List<Character> charSeparateToList(String string){
            List<Character> list = new ArrayList<>();

            for (char c : string.toCharArray()){
                list.add(c);
            }

            return list;
        }
        
    //===========================
    //Separate characters (Arrays)
    //===========================
        //numbers non-decimal 8 bit
        public static char[] charSeparateToArray(byte number){
            return Byte.toString(number).toCharArray();
        }
        
        //numbers non-decimal 16 bit
        public static char[] charSeparateToArray(short number){
            return Short.toString(number).toCharArray();
        }
        
        //numbers non-decimal 32 bit
        public static char[] charSeparateToArray(int number){
            return Integer.toString(number).toCharArray();
        }
        
        //numbers non-decimal 64 bit
        public static char[] charSeparateToArray(long number){
            return Long.toString(number).toCharArray();
        }
        
        //numbers decimal 32 bit
        public static char[] charSeparateToArray(float number){
            return Float.toString(number).toCharArray();
        }
        
        //numbers decimal 64 bit
        public static char[] charSeparateToArray(double number){
            return Double.toString(number).toCharArray();
        }

        //strings
        public static char[] charSeparateToArray(String string){
            return string.toCharArray();
        }
}
