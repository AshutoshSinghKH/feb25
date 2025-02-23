import java.util.Scanner;
class ass12 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        int rev_no = 0;
        
     
        while (a != 0) {
            int c = a % 10; 
            rev_no = rev_no * 10 + c; 
           a /= 10;
        }
        
        
        System.out.println("Reversed Number: " + rev_no);
       
    }
}
