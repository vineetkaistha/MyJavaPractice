package Strings;


public class Q25_ReplaceCharSeqRegExp {
    public static void main(String[] args) {

        String s="The quick brown fox fox over fox lazy dog.";
        System.out.println("Original String:- "+ s);
        String s1=s.replaceAll("fox", "cat");
        System.out.println("New String :"+ s1);

    }
}
