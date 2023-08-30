package Arrays;

import java.util.Arrays;

public class Q11_reverseArray {

    public static void main(String[] args) {
        int[] a = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("original array --" + Arrays.toString(a));

        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println("Reversing of array-"+ Arrays.toString(a));


    }
}
