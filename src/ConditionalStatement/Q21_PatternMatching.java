package ConditionalStatement;


/*

         *
        ***
       *****
      *******
     *********
    ***********
   *************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

 */
import java.util.Scanner;

public class Q21_PatternMatching {
    public static void main(String[] args) {
    int k;

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the rows:- ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(k=1;k<=num-i;k++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i=num;i>=1;i--)
        {
            for(k=1;k<=num-i;k++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
