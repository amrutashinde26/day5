package Day5;

import java.util.Scanner;

public class Leapyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please  enter  four digit year ");
        int y = sc.nextInt();
        if(y >= 1000 && y <= 9999 )
        {
            boolean result = isleapyear(y);
            if (result) {
                System.out.println(y + " Is A Leap year");
            }
            else
            {
                System.out.println(y + " Is Not A Leap Year ");
            }
        }
        else {
            System.out.println("Please Enter A Valid Year  ");
             }
    }
    public static boolean isleapyear(int year)
        {
        if(year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                return year % 400 == 0;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false ;
        }
        }
}
