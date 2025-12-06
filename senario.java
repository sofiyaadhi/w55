import java.util.Scanner;

/**
 * Write a description of class senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senario
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        

        final double FEE_RATE = 0.005; // 0.5% processing fee
        final int MIN_DEPOSIT = 1000;
        final int MAX_YEARS = 5;
        final int MIN_RATE = 8;
        final int MAX_RATE = 12;

        System.out.println("  Nepal Investment Bank - FD Calculator");
        System.out.println("==============================================\n");
        
    
        double principal;
        while (true) {
            System.out.print("Enter principal amount (minimum Rs. " + MIN_DEPOSIT + "): Rs. ");
            principal = scan.nextDouble();
            if (principal >= MIN_DEPOSIT) {
                break;
            }
            System.out.println("Error: Minimum deposit is Rs. " + MIN_DEPOSIT);
        }
        
        int years;
        while (true) {
            System.out.print("Enter duration in years (maximum " + MAX_YEARS + " years): ");
            years = scan.nextInt();
            if (years >= 1 && years <= MAX_YEARS) {
                break;
            }
            System.out.println("Error: Duration must be between 1 and " + MAX_YEARS + " years");
        }
        
        System.out.println("  Calculating FD Returns for Different Rates");
        
     
        int annualRate = MIN_RATE;
        while (annualRate <= MAX_RATE) {
     
            double monthlyRate = annualRate / 12.0 / 100.0;
            
  
            int months = years * 12;
            
         
            double maturityAmount = principal * Math.pow(1 + monthlyRate, months);
            
            double fee = maturityAmount * FEE_RATE;
            
            
            double finalAmount = maturityAmount - fee;
            
            double interestEarned = maturityAmount - principal;
            
            System.out.println("Annual Interest Rate: " + annualRate + "%");
            System.out.println("Monthly Interest Rate: " + String.format("%.4f", monthlyRate * 100) + "%");
            System.out.println("Duration: " + years + " years (" + months + " months)");
            System.out.println("Principal Amount: Rs. " + String.format("%.2f", principal));
            System.out.println("Maturity Amount (before fee): Rs. " + String.format("%.2f", maturityAmount));
            System.out.println("Interest Earned: Rs. " + String.format("%.2f", interestEarned));
            System.out.println("Processing Fee (0.5%): Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount (after fee): Rs. " + String.format("%.2f", finalAmount));
            System.out.println("----------------------------------------------\n");
            
            annualRate++;
        }
        
        scan.close();
        
        System.out.println("==============================================");
        System.out.println("  Thank you for using NIB FD Calculator!");
        System.out.println("==============================================");
    }
}
    
