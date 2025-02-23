import java.util.Scanner;

class ass6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first no ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a*b;
        int division = a / b;
        int mod = a % b;
        System.out.println(" addition is " + sum);
        System.out.println("The substraction is " + subtraction);
        System.out.println("The multiplication is " + multiplication);
        System.out.println("The division is" + division);
        System.out.println("The mod is " + mod);
        input.close(); 
    }
}