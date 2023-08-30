package Arrays;

public class Q32_FindSpecificNum {

    public static void main(String[] args) {

        int[] a=new int[]{77, 77, 65, 65, 65, 77};
        int len=a.length;
        boolean flag=false;
        int i=0;
        int cnt=0;
        while(i<len)
        {
            if(a[i]==77 || a[i]==65)
            {
                flag=true;
                cnt++;
                i++;
            }
        }

       if(flag)
       {
           System.out.println("There are total "+ cnt+"  index where 65 and 77 is found");
       }

    }
}
