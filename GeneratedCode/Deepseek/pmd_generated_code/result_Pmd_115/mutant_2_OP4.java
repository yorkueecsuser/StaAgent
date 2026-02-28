import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 3: ");
        int choice = sc.nextInt();
        sc.close();

        if (getCondition()) {
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
            }
        } else {
            System.out.println("No choice made"); // Mutated code: TooFewBranchesForASwitchStatement
        }
    }

    public int showBug() {
        return 0;
    }

    public static boolean getCondition() {
        return true;
    }
}