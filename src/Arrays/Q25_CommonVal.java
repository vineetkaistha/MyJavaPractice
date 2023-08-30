package Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Q25_CommonVal {

    public static void main(String[] args) {

        ArrayList<Integer> comman=new ArrayList<Integer>();
        int [] a=new int[]{2, 4, 8};
        int [] b=new int[]{2, 3, 4, 8, 10, 16};
        int [] c=new int[]{4, 8, 14, 40};

        int x=0, y=0,z=0;

        while(x<a.length && y<b.length && z<c.length)
        {
            if(a[x]==b[y] && b[y]==c[z]) {
                comman.add(a[x]);
                x++;
                y++;
                z++;
            }
            else if(a[x]<b[y])
            {
                x++;
            }
            else if(b[y]<c[z])
            {
                y++;
            }
            else
            {
                z++;
            }
        }
        System.out.println("Comman elements---" + comman);







    }


}
