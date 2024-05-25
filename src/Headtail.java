package Day5;

import java.util.Random;

public class Headtail {
    public static void main(String args[])
    {
        Random r = new Random();
        int head = 0 ;
        for(int i= 0; i <  1000 ; i++)
        {
            int side = r.nextInt(2);
            if(side==1)
            {
                head++;
            }
        }
        System.out.println("Times head was flipped : " + head );
        System.out.println("Times Tail was flipped : " + ( head - 1000) );
    }

}
