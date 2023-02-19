import java.util.Scanner;

public class kevinRamirez {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your full name: ");

        String name = input.nextLine();

        System.out.println("Welcome " + name);
        System.out.println("Enter the first number");
        int x = input.nextInt();       
        System.out.println("Enter the second number");
        int y = input.nextInt();       

        int add =  x + y;
        
        int mult = x * y;

        int div = x / y;

        int rem = x % y;

        System.out.printf(x + " + " + y + " = " + add);
        System.out.printf( "\n" + x + " * " + y + " = " + mult);
        System.out.printf( "\n" + x + " / " + y + " = " + div);
        System.out.printf( "\n" + x + " mod " + y + " = " + rem);
    }
}
