package ConditionalStatement;

import java.util.Scanner;

public class Q8_CharDisplay {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character--:");
        String ch=sc.next().toLowerCase();

        boolean upperCase=ch.charAt(0)>=65 && ch.charAt(0)<=90;
        boolean lowerCase=ch.charAt(0)>=97 && ch.charAt(0)<=122;
        boolean vowels=ch.equals("a")|| ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u");

        if (ch.length()>1)
        {
            System.out.println("Please enter the valid input--Character values is more than one");

        } else if (!(upperCase || lowerCase))
        {
            System.out.println("Enter the valid input in upper case or lower case");

        }
        else if (vowels)
        {
            System.out.println("Its the vowel");
        }
        else
        {
            System.out.println("Consonants");

        }


    }
}
