import java.util.Scanner;

class DoomedTestForEqualityToNaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();

        // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
        int ysveugdc = 0;switch  (ysveugdc) {case 1:boolean snhxjyry = true;break;default:String qjyqbsaf = "xakdyaxj";break;}
        if (x == Double.NaN) {
            System.out.println("The number is NaN");
        } else {
            System.out.println("The number is not NaN");
        }
    
}
}