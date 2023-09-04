package Strings;

public class Q26_CheckGivenString {
    public static void main(String[] args) {

        String str="Red is favorite color.";
        boolean res =str.startsWith("Red");
        System.out.println(str+" starts with Red? "+ res);

        String str1="Orange is favorite color.";
        boolean res1 =str1.startsWith("Red");
        System.out.println(str1+" starts with Red? "+ res1);
    }
}
