package Strings;

public class ReverseString {

    public static void main(String[] args) {
        String str="Hello";
        System.out.println("Original String: "+ str);
        String res="";
        //Approach 1
        /*
        char[] ch=str.toCharArray();
        int len=ch.length;

        for(int i=len-1;i>=0;i--)
        {
            System.out.print(ch[i]);
            res=res+ch[i];

        }
        System.out.println("New String: "+ res);*/

        //Approach 2
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
            res=res+str.charAt(i);

        }
       System.out.println("New String: "+ res);
    }
}
