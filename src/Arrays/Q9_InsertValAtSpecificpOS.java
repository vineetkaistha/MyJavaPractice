package Arrays;

import javax.management.MBeanAttributeInfo;

public class Q9_InsertValAtSpecificpOS {

    public static void main(String[] args) {
        int a[]=new int[]{10,20,30, 40,50};
        System.out.println("Before insertion");
        System.out.println("-------------------");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");

        }
        int pos=3;
        int ele=100;

        for(int i= a.length-1;i>pos-1;i--)
        {
            a[i]=a[i-1];
        }

        a[pos-1]=ele;

        System.out.println("--------------------");
        System.out.println("After insertion");
        System.out.println("--------------------");

        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }

    }
}
