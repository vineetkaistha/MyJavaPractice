package Arrays;

public class Q7_removeElement {
    public static void main(String[] args) {
        int a[]=new int[]{10,20,30, 40,50};

        int delItem=30;
        System.out.println("Before deletion");
        System.out.print("-----------------");
        System.out.println();

        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        for(int i=0;i<a.length;i++)
        {
            if(delItem==a[i])
            {
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                break;
            }
        }
        System.out.println();
        System.out.println("-----------------");
        System.out.println("After deletion");
        System.out.print("-----------------");
        System.out.println();

        for (int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
