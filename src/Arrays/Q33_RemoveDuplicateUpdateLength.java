package Arrays;

public class Q33_RemoveDuplicateUpdateLength {

    public static void main(String[] args) {
        int[] a =new int[]{20, 20, 30, 40, 50, 50, 50};

        int len=a.length-1;
        int i=0;
        int cnt=1;
        while(i<len)
        {
            if(a[i]!=a[cnt-1])
            {
               a[cnt++]=a[i];
               i++;
            }
            else
            {
                i++;
            }

        }
        System.out.println("New length of array is :-"+ cnt);
    }
}
