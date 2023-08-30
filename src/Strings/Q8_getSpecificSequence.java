package Strings;

public class Q8_getSpecificSequence
{
    public static void main(String[] args)
    {
        String str="PHP Exercises and Python Exercises";
        String seq="hello";
        System.out.println("Original String: "+ str);
        System.out.println("Specified sequence of char values:"+ seq);
        System.out.println("The string sequence found :-"+ str.contains(seq));
    }
}
