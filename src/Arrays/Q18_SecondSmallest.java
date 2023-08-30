package Arrays;

import java.util.Arrays;

public class Q18_SecondSmallest {

    public static void main(String[] args) {
        int[] a = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("original array --" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting--" + Arrays.toString(a));
        System.out.println("Second smallest --" + a[1]);


    }
}
