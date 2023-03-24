package homework_week_6;
/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
import java.util.Scanner;
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //scanner declaration fo reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit  : ");
        float temp =scanner.nextFloat();

        //object creation
        Programme_7_TempConversion t =new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);

        //close teh scanner object
        scanner.close();

    }
    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp-32)*5/9);
        System.out.println("The Temperature " + temp + " Fahrenheit is equal to " + c + "degree celsius");
    }
}
