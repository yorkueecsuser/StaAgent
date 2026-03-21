import java.util.Scanner;

class DoomedTestForEqualityToNaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();

        // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
        if (true && false && false && true && false && false && false && false && false && false && false) {char uhacqckd = 'r';}
        if (x == Double.NaN) {
            System.out.println("The number is NaN");
        } else {
            System.out.println("The number is not NaN");
        }
    
}
}