package Arrays;

import java.util.Arrays;

public class Q13_StringDuplicate {
    public static void main(String[] args)
    {
        String[] a = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        System.out.println("original array --" + Arrays.toString(a));
       int cnt=0;
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
        }
    }

}
