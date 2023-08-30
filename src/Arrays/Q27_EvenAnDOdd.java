package Arrays;

public class Q27_EvenAnDOdd {

    public static void main(String[] args) {

        int a[]=new int[]{50,25,10,9};
        int evenCnt=0, oddCount=0;
        int i=0;
        while(i<a.length)
        {
            if(a[i]%2==0)
            {
                evenCnt++;
            }
            else
            {
                oddCount++;
            }
            i++;
        }

        System.out.println("There are total "+ evenCnt+ " even number and "+ oddCount + " odd number in the array");

    }
}
