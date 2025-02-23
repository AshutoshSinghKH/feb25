import java.util.Scanner;
class ass13 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter a 2nd number: ");
        int b = input.nextInt();
        System.out.print("Enter a 3rd number: ");
         int c = input.nextInt();

    int d=(a+b+c)/3;
        
        System.out.println("The average of three no is " +d);
       
    }
}
