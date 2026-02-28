import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 3: ");
        int choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                System.out.println("You chose 1");
                break;
            case 2:
                System.out.println("You chose 2");
                break;
            case 3:
                System.out.println("You chose 3");
                break;
            default:
                System.out.println("Invalid choice"); // BUG: TooFewBranchesForASwitchStatement
        }

        if (false) { // Unreachable if-else branch
            System.out.println("You shouldn't see this message!");
        } else {
            System.out.println("This message will always be printed.");
        }
    }

    public int showBug() {
        if (true) { // Unreachable if-else branch
            System.out.println("This message will never be printed.");
        } else {
            System.out.println("This message will always be printed.");
        }
        return 0; // BUG: TooFewBranchesForASwitchStatement
    }
}