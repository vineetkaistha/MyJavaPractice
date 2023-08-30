package Arrays;

import java.util.Scanner;

public class Q4_AverageArray {

    public static void main(String[] args) {

        int sum=0;
        double avg=0;
        int a[]=new int[] {20, 30, 25, 35, -16, 60, -100};
        int len=a.length;

        for(int i=0;i<len;i++)
        {
            sum=sum+a[i];

        }
        System.out.println("The sum of all the num in array=="+ sum);
        avg=sum/len;
        System.out.println("The avg of all the num="+ avg);

    }
}
