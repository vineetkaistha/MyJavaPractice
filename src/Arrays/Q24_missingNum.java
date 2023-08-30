package Arrays;

public class Q24_missingNum {

    public static void missing_number(int[] arr)
    {
        int expected_length= arr.length+1;
        System.out.println("Expected length="+ expected_length);
        int total_sum=expected_length*(expected_length+1)/2;
        System.out.println("Total sum="+ total_sum);
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int missing_value=total_sum-sum;
        System.out.println("Missing num ="+missing_value);
    }

    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4,6};
        missing_number(a);




    }
}
