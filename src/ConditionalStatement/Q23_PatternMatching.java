package ConditionalStatement;


/*
 ******
  *****
   ****
    ***
     **
      *

 */
public class Q23_PatternMatching {

    public static void main(String[] args)
    {
        int num=5;
        int x=num-1;

        for(int i=num;i>=1;i--)
        {

            for (int k = num-i; k>0; k--) {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
