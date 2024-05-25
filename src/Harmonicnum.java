package Day5;

public class Harmonicnum {
    public static void main(String args[])
    {
        int n= 5 ;
        double result = isharmonic(n);
        System.out.println("The Harmonic Number of " + n + " is "+ result);
    }

    public static double isharmonic(int num)
    {
        double  sum = 0.0 ;
        for(int i = 1 ; i <=num; i++)
        {
            sum  +=  1.0 / i;
        }
        return sum;
    }

}
