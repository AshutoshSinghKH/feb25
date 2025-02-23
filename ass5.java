import java.util.Scanner;
class ass5 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int b = input.nextInt();

       
        System.out.print("Enter the second number: ");
        int a = input.nextInt();

     
        int multi = a * b;

        
        System.out.println("The multiplication is: " + multi);

        
        input.close();
    }
}