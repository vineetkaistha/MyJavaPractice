package ConditionalStatement;

import java.util.Scanner;

public class Q1_PositiveAndNegative {

    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter number:-");
            int num=sc.nextInt();
            if (num>=0)
            {
                System.out.println("Number is positive");
            }

            else {
                System.out.println("Number is negative");
            }
        }
    }



