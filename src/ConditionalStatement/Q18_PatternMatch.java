package ConditionalStatement;


/*
1
2 3
4 5 6
7 8 9 10

 */
public class Q18_PatternMatch {
    public static void main(String[] args) {
        int k=1;

        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(k++);
                System.out.print(" ");

            }
            System.out.println(" ");
        }

    }
}
