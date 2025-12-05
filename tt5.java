import java.util.Scanner;

/**
 * Write a description of class tt5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tt5
{public static void main(String[] args){

    int sum=0;
    Scanner input= new Scanner(System.in);
    System.out.println("Ask for range:");
    int range= input.nextInt();
    
    for(int i=1; i<=10; i++)
    {
        sum=sum+ i;
    }
    
    System.out.println(sum);

}
}