import java.util.Scanner;

class DoomedTestForEqualityToNaN {
public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double x = scanner.nextDouble();
    if(x == Double.NaN){ System.out.println("The number is NaN"); } else { System.out.println("The number is not NaN"); }
}
}