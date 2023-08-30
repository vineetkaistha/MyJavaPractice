package ConditionalStatement;

import java.util.Scanner;

public class Q3_GreatestNum {
    public static void main(String[] args) {
        int num1,num2,num3;
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter 1 number:-");
            num1=sc.nextInt();

            System.out.println("Please enter 2 number:-");
            num2=sc.nextInt();

            System.out.println("Please enter 3 number:-");
            num3=sc.nextInt();

            if(num1>num2)
            {
                if(num1>num3)
                {
                    System.out.println("Num is greater-"+num1);
                }

            }
             if (num2>num1)
            {
                if(num2>num3)
                {
                    System.out.println("Num is greater-"+num2);
                }

            }
            if (num3> num1)
            {
                if(num3>num2)
                {
                    System.out.println("Num is greater-"+num3);
                }

            }



    }

}
