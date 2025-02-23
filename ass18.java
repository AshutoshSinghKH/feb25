import java.util.Scanner;

class ass18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Input the temp in celsius");
        double a = input.nextDouble();
        
            double b = (a * 9/5) +32;
            System.out.println("The temp in fahrenheit is"+b);
           
            

       
    }
}
