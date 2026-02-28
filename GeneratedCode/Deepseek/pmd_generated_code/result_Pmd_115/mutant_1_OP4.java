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
                System.out.println("Invalid choice");
                if(false) {
                    // This is a mutated code added by the Unreachable if-else statement Mutation Operator
                    // This if-else is non-reachable as the condition is always false
                    System.out.println("You will never see this message");
                } else {
                    System.out.println("This is a random message");
                }
        }
    }

    public int showBug() {
        if(false) {
            // This is a mutated code added by the Unreachable if-else statement Mutation Operator
            // This if-else is non-reachable as the condition is always false
            return 1;
        } else {
            return 0;
        }
    }
}