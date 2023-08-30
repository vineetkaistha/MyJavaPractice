package ConditionalStatement;

import java.util.Scanner;

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

public class Q20_PatternMatching
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of rows--");
        int num=sc.nextInt();

        int i,j,k=1;

        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k++);
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}
