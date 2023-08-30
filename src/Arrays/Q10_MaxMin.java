package Arrays;

import java.util.Arrays;

public class Q10_MaxMin
{
    static int max_val;
    static int min_val;

    public static void main(String[] args) {
        int[] a = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
       System.out.println("original array --" + Arrays.toString(a));
        int max_val = a[0];
        int min_val = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max_val)
            {
                max_val = a[i];
            }
            if (a[i] < min_val)
            {
                min_val = a[i];
            }
        }
        System.out.println("The max value==" + max_val);
        System.out.println("The min value==" + min_val);

    }
}




