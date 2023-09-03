package Strings;

public class Q9_CompareStringWithCharSeq {
    public static void main(String[] args)
    {
        String str = "Example.com";
        String str2 = "example.com";
        System.out.println("Original String: " + str);
        System.out.println("Another string" + str2);

        boolean res = str.contentEquals(str2);
        System.out.println("Comparing "+ str+" and "+ str2+"="+res );


    }
}
