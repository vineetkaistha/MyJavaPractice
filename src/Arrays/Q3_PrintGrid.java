package Arrays;

import java.util.Scanner;

public class Q3_PrintGrid {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows--");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }*/

        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
