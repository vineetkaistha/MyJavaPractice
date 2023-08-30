package Arrays;

import java.util.Arrays;

public class Q8_copyArray {
    public static void main(String[] args) {
        int a[]=new int[]{10,20,30,40};
        int b[]=new int[4];
        System.out.println("original array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println();
        System.out.println("New array");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+",");
        }

    }
}
