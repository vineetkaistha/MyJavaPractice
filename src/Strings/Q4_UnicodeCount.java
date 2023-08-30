package Strings;

public class Q4_UnicodeCount {

    public static void main(String[] args)
    {
        String str="w3resource.com";
        System.out.println("Original String : "+str);
        int start_index=1;
        int end_index=str.length();
        int val1=str.codePointCount(start_index, end_index);


        System.out.println("Character(unicode point) = " + val1);

    }
}
