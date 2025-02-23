import java.util.Scanner;

class ass17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the no ");
        int a = input.nextInt();
        if (a <= 0) {
            System.out.println("Please enter a positive integer input no is negative.");
        } else {
            System.out.println("The first  natural numbers are");
            for (int i = 1; i <= a; i++) {
                System.out.print(+i );
            }
            System.out.println(); 
        }

       
    }
}
