import java.util.Scanner;
public class PrimeIntervel
{
   public static void main(String args[])
    {
         int s1, s2, s3, temp = 0, i, j;
         Scanner s = new Scanner(System.in);
         System.out.println (" "); 
         s1 = s.nextInt();
         System.out.println (" "); 
         s2 = s.nextInt();
         System.out.println (" ");
         for(i = s1; i <= s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     temp = 0;
                     break;
                 }
                 else
                 {
                    temp = 1;
                 }
             }
             if(temp == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
