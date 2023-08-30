package Strings;

public class Q7_ConcatenateStringAtEnd
{
    public static void main(String[] args)
    {
        String str1= "PHP Exercises and";
        String str2=" Python Exercises";
        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);
        String newString=str1.concat(str2);

        System.out.println("The concatenated string is :"+ newString);
    }
}
