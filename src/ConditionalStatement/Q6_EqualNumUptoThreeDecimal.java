package ConditionalStatement;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q6_EqualNumUptoThreeDecimal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first the num--");
        float num1=sc.nextFloat();
        System.out.println("please enter Second the num--");
        float num2=sc.nextFloat();
        //logic

        num1=Math.round(num1*1000);
        num1=num1/1000;
        System.out.println(num1);

        num2=Math.round(num2*1000);
        num2=num2/1000;
        System.out.println(num2);


        if(num1==num2)
        {
            System.out.println("Numbers are equal upto 3 decimal");
        }
        else {
            System.out.println("Numbers are different");
        }

    }


}
