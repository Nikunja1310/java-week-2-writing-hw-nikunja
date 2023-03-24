package homework_week_6;
/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number : ");
        int number = scanner.nextInt();

        convertDecimalToBinary(number);
        scanner.close();    //closing the scanner object

    }
    public static void convertDecimalToBinary(int number ){
        String binary = Integer.toBinaryString(number);
        System.out.println("The Binary value is : " + binary);
    }
}
