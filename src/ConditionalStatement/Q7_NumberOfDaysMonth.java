package ConditionalStatement;

import java.util.Scanner;

public class Q7_NumberOfDaysMonth {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //Enter the number of month
        System.out.println("Please enter the month number between 1-12:-");
        int numOfMonth= sc.nextInt();

        //Enter the number of year
        System.out.println("Please enter the year-");
        int year= sc.nextInt();

        switch (numOfMonth)
        {
            case 1:
                System.out.println("Jan "+year+ " has 31 days");
                break;

            case 2:
                if((year%400==0) || ((year % 4==0) && (year % 100!=0)))
                {
                    System.out.println("Feb "+year+ " has 29 days");
                    break;
                }
                else
                {
                    System.out.println("Feb "+year+ " has 28 days");
                    break;
                }
            case 3:
                System.out.println("Mar "+year+ " has 31 days");
                break;

            case 4:
                System.out.println("Apr "+year+ " has 30 days");
                break;

            case 5:
                System.out.println("May "+year+ " has 31 days");
                break;

            case 6:
                System.out.println("June "+year+ " has 30 days");
                break;


            case 7:
                System.out.println("July "+year+ " has 31 days");
                break;

            case 8:
                System.out.println("Aug "+year+ " has 31 days");
                break;

            case 9:
                System.out.println("Sep "+year+ " has 30 days");
                break;

            case 10:
                System.out.println("Oct "+year+ " has 31 days");
                break;

            case 11:
                System.out.println("Nov "+year+ " has 30 days");
                break;

            case 12:
                System.out.println("Dec "+year+ " has 31 days");
                break;

            default:
                System.out.println("Please enter the correct month number or year");


        }


    }
}
