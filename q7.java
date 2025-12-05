import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {

            double num1, num2;

            System.out.print("Enter first number: ");
            num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scan.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scan.next().charAt(0);

            double output = 0;

            switch (operator) {
                case '+':
                    output = num1 + num2;
                    break;

                case '-':
                    output = num1 - num2;
                    break;

                case '*':
                    output = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0) {
                        output = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        continue;  
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    continue; 
            }

            System.out.println("Result: " + output);

            System.out.print("Do you want to calculate again? (yes/no): ");
            choice = scan.next();
        }

        System.out.println("Calculator exited. Goodbye!");
        scan.close();
    }
}
      
     
