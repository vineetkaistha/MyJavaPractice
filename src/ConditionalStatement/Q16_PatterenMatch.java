package ConditionalStatement;

/*

Print the following pattern
1
12
123
1234
12345
1234567
12345678
123456789
12345678910
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q16_PatterenMatch {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:-");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.println(" ");

        }

    }
}
