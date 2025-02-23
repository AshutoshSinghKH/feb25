import java.util.Scanner;
class ass8{
     public static void main(String[] agrs){
     Scanner input = new Scanner(System.in);
     int a=10;
     int b=20;
     System.out.println("Before swapping the first no is" +a );
     System.out.println("Before swapping the second no is" +b );
    
     a=a+b; // a=30
     b=a-b; // b=30-20=10 --- b= 10
     a=a-b; // a=30-10=20---- a= 20
     System.out.println(" After swapping the first no is" +a);
     System.out.println("After swapping the second no is" +b );
     
}
}