package ConditionalStatement;

/*
*
***
*****
*******
*****
***
*
 */

public class Extra_PatternMatching {

    public static void main(String[] args) {

        for(int i =1;i<=7;i++)
        {
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =7;i>=1;i--)
        {
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
