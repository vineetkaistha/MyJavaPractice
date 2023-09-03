package Strings;

public class Q13_ContainsSameData {

    public static void main(String[] args) {
        String str1="Stephen Edwin King";
        String str2="Walter Winchell";
        String str3 = "Mike Royko";

        boolean res1=str1.equals(str2);
        boolean res2=str1.equals(str3);

        System.out.println("\"" + str1 + "\" equals \"" +
                str2 + "\"? " + res1);
        System.out.println("\"" + str1 + "\" equals \"" +
                str3 + "\"? " + res2);


    }
}
