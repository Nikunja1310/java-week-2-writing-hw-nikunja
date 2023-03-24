package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_convertUpperToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Scanner declaration for reading input from console
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();

        Programme_9_convertUpperToLowerCase t = new Programme_9_convertUpperToLowerCase();
        t.convertUpperToLowercase(uppercase);


    }
    //Conversion of Uppercase to Lower case method
    public void convertUpperToLowercase (String text){
        System.out.println("The lowercase value is  = " + text.toLowerCase());
    }
}
