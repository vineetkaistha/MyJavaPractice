package ConditionalStatement;
/*
      @
     @@
    @@@
   @@@@
  @@@@@
 @@@@@@
 */
import java.util.Scanner;

public class Q24_PatternMatching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value:-");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int k=1;k<=num-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
