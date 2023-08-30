package Arrays;

import java.util.Scanner;

public class Q22_SumSpecificVal {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value");
        int num=sc.nextInt();
        int sum=0;
        int cnt=0;

        int[] a =new int[]{10, 30, 50, 20};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(i!=j)
                {
                    sum = a[i] + a[j];
                    if (sum == num) {
                        cnt++;
                        sum=0;
                    }
                }
            }
        }
        System.out.println("Total num of combinations found:"+ cnt);
    }
}
