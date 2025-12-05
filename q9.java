import java.util.Scanner;

/**
 * Write a description of class q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q9
{
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number = number / 10;
        }
        System.out.println("The reversed number is: " + reversedNumber);
 
        System.out.println(" Goodbye!");
        scan.close();
    }
}