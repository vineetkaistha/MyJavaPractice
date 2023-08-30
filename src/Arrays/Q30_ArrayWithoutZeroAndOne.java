package Arrays;

public class Q30_ArrayWithoutZeroAndOne {

    public static void main(String[] args) {

        int[] a =new int[]{50, 77, 12, 54, -11};
        int i=0;
        boolean flag=false;
        while(i<a.length)
        {
            if(a[i]!=0 || a[i]!=-1)
            {
                flag=true;
                i++;

            }
        }
        if(flag)
        {
            System.out.println("No 0 or -1 found in the array");
        }
        else
        {
            System.out.println(") or -1 found in the array");
        }
    }
}
