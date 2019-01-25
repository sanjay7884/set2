import java.util.Scanner;
import java.io.*;
 class MultipleOfFive
{
  public static void main(String args[])
  {
    int s,n,c;
    System.out.println(" ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    for (s = 1; s <= 5; s++)
    {
      c=s*n;
      System.out.println(c);
    }
  }
}
