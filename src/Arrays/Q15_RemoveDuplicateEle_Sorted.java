package Arrays;

import java.util.Arrays;

public class Q15_RemoveDuplicateEle_Sorted {

    public static void main(String[] args) {
        int[] a =new int[]{11,22,22,33,33,44,55,55};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(a));
        int[] temp= new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        System.out.println("New array");
        System.out.println(Arrays.toString(temp));

    }
}
