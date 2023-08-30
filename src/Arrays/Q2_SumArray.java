package Arrays;

public class Q2_SumArray {
    public static void main(String[] args) {
        int a[]= {3,6,2,12};
        int len=a.length;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println("The sum of all the values in arrays:- "+sum);
    }
}
