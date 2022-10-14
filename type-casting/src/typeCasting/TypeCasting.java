package typeCasting;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * NOTE:
 *
 * Automatic type conversion:
 * When one type of data is assigned to another type of variable, automatic
 * type conversion will take place if following conditions are met:
 *
 * 1) Two types should be compatible. ex: String type can't be converted into float or int.
 * 2) Destination type should be greater than the input type. ex: float is greater than int so
 *    when int value is passed to a variable assigned as float, the int value will be converted
 *    as float.
 *    LOWER TO HIGHER >> automatic type conversion is possible.
 */

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();

        System.out.println(num);

        /**
         * Type Casting:
         * When greater type value (float) is converted into smaller type value (int)
         *  then it is called type casting. Example as shown in the below code sample:
         *
         *  int num = (int) (64.34);
         */

        int num1 = (int) (534.34);
        System.out.println(num1);

        /**
         * Automatic type promotion in expressions:
         *
         * int a = 257;
         * byte b = (byte) (a);
         *
         * In above case, we are performing type casting from int to byte. However, byte can't store
         * 257 so it stores the modulus i.e. 257 % 256 = 1
         */

        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = a * b / c;

        /**
         * Java automatically converts the bytes into integer while the expression is evaluated.
         * ex: in the above code.
         */

        System.out.println("Type promoted in expression: " + d);

        /**
         * In the below code, we assign character to the variable of type int. It prints 97
         * because of type promotion.
         *
         * RULES OF TYPE PROMOTION:
         * 1) byte, char is promoted to int.
         * 2) int is converted into float. ex: 3 * 4.5 will result in float value.
         */
        int number = 'a';
        System.out.println(number);
    }
}
