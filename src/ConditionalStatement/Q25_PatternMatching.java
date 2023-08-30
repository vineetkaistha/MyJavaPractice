package ConditionalStatement;


/*
Expected Output :


      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1
 */
public class Q25_PatternMatching {
    public static void main(String[] args) {
        int num=5;

        for(int i=1;i<=num;i++)
        {
            for(int spc=num-1;spc>0;spc--)
            {
                System.out.print("");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
