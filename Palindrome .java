import java.util.Scanner;
public class Palindrome 
{
public static void main(String[] args)
{
System.out.println("  ");
int num = new Scanner(System.in).nextInt();
int number=num;
int rev=0;
while (number != 0) 
{
int rem = number % 10;
rev = rev * 10 + rem;
number = number / 10;
} 
if(num == rev)
System.out.println("yes");
else
System.out.println("no");
}
}
