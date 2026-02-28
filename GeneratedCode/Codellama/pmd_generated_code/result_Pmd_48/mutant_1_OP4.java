import java.util.Scanner;

class ImplicitSwitchFallThrough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered 1");
            case 2: // BUG: ImplicitSwitchFallThrough
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        // Unreachable if-else statement
        if (num == 1) {
            System.out.println("You entered 1");
        } else if (num == 2) {
            System.out.println("You entered 2");
        } else if (num == 3) {
            System.out.println("You entered 3");
        } else {
            System.out.println("Invalid input");
        }
    }
}