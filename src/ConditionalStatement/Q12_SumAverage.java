package ConditionalStatement;

import java.util.Scanner;

public class Q12_SumAverage {

    public static void main(String[] args) {
        int sum=0;
        int average=0;
        int max_val=5;

        for (int i=1;i<=5;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter" + i + " number--");
            int num=sc.nextInt();
            sum=sum+num;
        }
        System.out.println("Total sum of 5 number are--"+sum);
        System.out.println("Average --"+ sum/max_val);

    }
}
