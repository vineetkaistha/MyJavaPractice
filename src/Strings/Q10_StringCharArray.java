package Strings;

public class Q10_StringCharArray {
    public static void main(String[] args)
    {
        char[] arr=new char[]{'1','2','3','4'};

        String str=String.copyValueOf(arr, 1,3);
        System.out.println("The book contains "+ str+ " pages.");


    }
}
