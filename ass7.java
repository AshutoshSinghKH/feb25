import java.util.Scanner;

class ass7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the no ");
        int a = input.nextInt();
        
        for(int i=1;i<=10;i++ )
        { int b = a*i;
        System.out.println("The multiple table is " +b);
        }
        input.close(); 
    }
}