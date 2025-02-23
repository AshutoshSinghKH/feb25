import java.util.Scanner;

class ass19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the base no");
        double a = input.nextDouble();
        System.out.print("Enter the exponent");
        double b = input.nextDouble();
        double c= Math.pow(a, b);
           
            System.out.println("Result is"+c);
           
            

       
    }
}
