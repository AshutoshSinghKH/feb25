import java.util.Scanner;

class ass20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the no");
        int a = input.nextInt();
        int count=0;
        if(a==0){
        count=1;}
        else{ while(a!=0){
        a /=10;
        count++;
}
}
        System.out.println("Result is"+count);
           
            

       
    }
}
