package Day5;

public class LargestOfThree {
    public  static  void main(String args[]){
        int a= 9 , b= 15 , c = 10 ;
        int max = (a > b) ? a : b ;
        int result = (max > c ) ? max : c ;
        System.out.println(result);
        }
    }

