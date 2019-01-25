import java.util.Scanner;
import java.io.*;
public class EvenIntervel
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(" ");
		int n = input.nextInt();
		System.out.println( n + " ");
		for(int i = 2; i <= n; i = i + 2)
		System.out.print(i + " ");
		input.close();
	}
}
