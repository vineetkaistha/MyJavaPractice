package Arrays;

import java.util.Scanner;

public class Q5_FindSpecificVal {

    public static void main(String[] args) {

        int a[]=new int[]{20, 30, 25, 35, -16, 60, -100};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the specific value--");
        int num=sc.nextInt();
        boolean flag=true;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num)
            {
                flag=true;
                System.out.println("Value found at position "+ i);

            }

            else
            {
                flag=false;
                System.out.println("Value not found");
            }

        }
    }
}
