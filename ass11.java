import java.util.Scanner;
class ass11{
     public static void main(String[] agrs){
     Scanner input = new Scanner(System.in);
     System.out.print(" INPUT the first no");
     int a =input.nextInt();
     System.out.print(" INPUT the second no");
     int b =input.nextInt();
     System.out.print(" INPUT the third no");
     int c =input.nextInt();
     int largest;

     if(a>=b && a>c){
     largest=a;
     }else if(b>a && b>c){
      largest=b;
      } else {largest=c;
      }
     System.out.print("The largest no is" +largest);
     
     
     
     
}
}