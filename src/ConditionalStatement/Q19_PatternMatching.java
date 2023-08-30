package ConditionalStatement;


/*
                 1
                2  2
               3  3  3
              4 4   4  4

 */
public class Q19_PatternMatching {
    public static void main(String[] args) {

        int x=3;
        for(int i=1; i<=4; i++)
        {

            for(int k=3; k!=0;k--)
            {
                System.out.println(" ");
            }
            for (int j=1;j<=i;j++)
            {

                System.out.print(i+" ");
            }

            System.out.println();
            x--;

        }



    }
}
