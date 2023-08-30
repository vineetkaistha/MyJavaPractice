package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q12_duplicateValues {


    public static void main(String[] args) {
        //Brut Force Method
        int[] a = new int[]{29, 14, 56, 77, 36, 56, 77, 18, 29, 49,29};
        System.out.println("original array --" + Arrays.toString(a));
       /* int cnt=0;
        int dup_val;
        System.out.print("Duplicate values are- ");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && (i!=j))
                {
                    System.out.println(a[j]+ " ");
                }
            }
        }*/

        //interface method
        /*Set<Integer> s=new HashSet<>();
        for(int no:a)
        {
            if(s.add(no)==false)
            {
                System.out.print(no+" ");
            }
        }*/

        // hash map



    }
}
