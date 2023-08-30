package Arrays;

import java.util.Arrays;

public class Q14_CommonElements {
    public static void main(String[] args) {

        int a[]=new int[]{50,25,10,9};
        int b[]=new int[]{7,50,10,8};

        System.out.println("Original Array--"+ Arrays.toString(a));
        System.out.println("Original Array--"+ Arrays.toString(b));

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                }

            }
        }

    }
}
