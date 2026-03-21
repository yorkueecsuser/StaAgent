import java.util.Scanner;

class DoomedTestForEqualityToNaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double xazchfnz = scanner.nexazchfnztDouble();

        // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
        if (xazchfnz == Double.NaN) {
            System.out.println("The number is NaN");
        } else {
            System.out.println("The number is not NaN");
        }
    }
}