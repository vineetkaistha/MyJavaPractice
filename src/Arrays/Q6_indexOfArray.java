package Arrays;

import java.util.Scanner;

public class Q6_indexOfArray {
    public static void main(String[] args) {

        int a[]=new int[]{20, 30, 25, 35, -16, 60, -100};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the specific value--");
        int num=sc.nextInt();

        System.out.println("The position of the val "+ num+ "="+ findIndex(a,num));



    }

    public static int findIndex(int[] my_array, int item)
    {

        if(my_array==null)
        {
            return -1;
        }
        int len =my_array.length;
        int i=0;

        while(i<len)
        {
            if(my_array[i]==item)
            {
                return i;
            }
            else{
                i=i+1;
            }
        }
        return -1;
    }
}
