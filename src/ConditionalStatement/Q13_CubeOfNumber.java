package ConditionalStatement;

import java.util.Scanner;

public class Q13_CubeOfNumber {
    public static void main(String[] args) {

        int cube;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number--");
        int num=sc.nextInt();

       for (int i=1;i<=num;i++)
       {
           cube=i*i*i;
           System.out.println("Number is : "+ i+ " and cube of "+ i+ " : " +cube);
       }









    }
}
