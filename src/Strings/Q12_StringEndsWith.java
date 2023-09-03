package Strings;

public class Q12_StringEndsWith {

    public static void main(String[] args) {
        String str1="Python Exercises";
        String str2="Python Exercise";

        String endWith="se";

        System.out.println(str1+ " ends with "+endWith+" ="+ str1.endsWith(endWith));
        System.out.println(str2+ " ends with "+endWith+" ="+ str2.endsWith(endWith));
    }
}
