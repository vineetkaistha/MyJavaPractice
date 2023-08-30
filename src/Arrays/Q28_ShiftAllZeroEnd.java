package Arrays;

import java.util.Arrays;

public class Q28_ShiftAllZeroEnd {

    public static void main(String[] args) {
        int[] a=new int[]{1,0,2,0,3,0,0,0};
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
               a[count]=a[i];
               count++;
            }

        }
        while(count<a.length){
            a[count]=0;
            count++;
        }

        System.out.println("After shifting all the zero");
        System.out.println(Arrays.toString(a));
    }
}
