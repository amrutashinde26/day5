package Day5;

import java.util.Scanner;

public class Descending {

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array :");
            int n= sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter the element :");
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.println("print the element ");
            for(int i=0 ; i< n;i++)
            {
                System.out.println(a[i]);
            }
            int temp ;
            for(int i = 0 ; i < n-1 ; i++)
            {
                for (int j = i + 1 ; j<n ; j++)
                {
                    if(a[i] < a[j])
                    {
                        temp = a[i];
                        a[i]=a[j];
                        a[j]= temp;
                    }
                }
            }
            System.out.println(("The Descending  order is : "));
            for(int i = 0 ; i < n ; i++)
            {
                System.out.println( i + " " + a[i]);
            }
        }
    }

