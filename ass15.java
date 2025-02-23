import java.util.Scanner;

class ass15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no: ");
        int a = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= a; i++) 
        { factorial *= i;
        } 
        System.out.println("Factorial is " + factorial);
       
    }
}
