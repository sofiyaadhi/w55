
/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{
    public static void main(String[] args)
    {
        int i=1;
        int sum=0;
        do
        {
            sum=sum+(i*i);
            i++;
            
        }
        while(i<=10);
        System.out.println("sum of square="+sum);
    }
}