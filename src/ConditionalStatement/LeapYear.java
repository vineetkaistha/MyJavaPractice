package ConditionalStatement;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year--");
        int year=sc.nextInt();

        if(year%4==0 || (year%4==0 && year % 100!=0) )
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It isa not a leap year");
        }

    }
}
