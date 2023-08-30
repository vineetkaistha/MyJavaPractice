package Arrays;


import java.util.Arrays;

public class Q29_AverageArrayExcept_largest_Smallest {
    public static void main(String[] args) {
       int  max_value=0, min_value=0;
        int[] a =new int[]{5,7,2,4,9};
        max_value=a[0];
        min_value=a[0];
        int sum=a[0];
        int len=a.length-2;
        for(int i =0;i<a.length;i++)
        {
            sum=sum+a[i];
            if(a[i]>max_value)
            {
                max_value=a[i];
            } else if (a[i]<min_value) {
                min_value=a[i];

            }
        }
        sum=sum-max_value-min_value;
        System.out.println(sum);
        System.out.println("Average of all the integer except Largest and Smallest is : "+ sum/len);





       /* System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        int len=a.length-2;
        int sum=0, avg=0;
        for(int i=1;i<=len;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Average of all the integer except Largest and Smallest is : "+ sum/len);

        */

        //second sol




    }
}
