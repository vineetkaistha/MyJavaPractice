package Strings;

public class Q27_GetSubstring {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog. ";
        System.out.println("Old = "+ str);
        String subString=str.substring(10,25);
        System.out.println("New = "+ subString);
    }
}
