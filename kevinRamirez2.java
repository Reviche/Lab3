import java.util.Scanner;
import java.lang.Math;
public class kevinRamirez2
{

  
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Please enter the last two digits of your student ID: ");

double studentID = input.nextDouble();

double sqrR = Math.sqrt(studentID);
double cbR = Math.pow(studentID, 3);

System.out.println("the square root the given number is: " + sqrR);
System.out.println("the cube of the given number is: " + cbR);

}

}
