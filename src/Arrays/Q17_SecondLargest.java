package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Q17_SecondLargest {

    public static void main(String[] args)
    {
        int [] a =new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array--"+ Arrays.toString(a));

        //method first
       /* int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After sorting--"+ Arrays.toString(a));
        System.out.println("The second largest number in the arrays is-"+ a[a.length-2]);
        System.out.println("The second smallest num in the arrays is:- "+ a[1]);
        */

        //Second Method

        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        System.out.println(largest+" " + second_largest);

        for (int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                second_largest=largest;
                largest=a[i];
            }
            else if(a[i]>second_largest && a[i]!=second_largest)
            {
                second_largest=a[i];
            }
        }
        System.out.println("The second largest is --"+ second_largest);



    }
}
