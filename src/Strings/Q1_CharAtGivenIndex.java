package Strings;

public class Q1_CharAtGivenIndex {
    public static void main(String[] args)
    {
        String str="Java Exercises!";
        System.out.println("Original String = "+ str);
        int len = str.length();
        System.out.println(len);
        System.out.println("The character at position 0 is: "+str.charAt(0));
        System.out.println("The character at position 10 is: "+str.charAt(10));
    }
}
