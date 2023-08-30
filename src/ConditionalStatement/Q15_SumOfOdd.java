package ConditionalStatement;

import java.util.Scanner;

public class Q15_SumOfOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please ent the num:-");
        int num=sc.nextInt();
        int sum=0;
        System.out.println("The odd num are:-");
        for(int i=1;i<=num*2;i++)
        {
            if(i%2!=0)
            {

                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("The sum of odd natural num upto "+ num + "  is : "+ sum);
    }
}
