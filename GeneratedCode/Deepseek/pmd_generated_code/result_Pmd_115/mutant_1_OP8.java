import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 3: ");
        int x = sc.nextInt(); // Mutation: Renamed 'choice' to 'x'
        sc.close();

        switch (x) { // Mutation: Renamed 'choice' to 'x'
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
    }

    public int showBug() {
        return 0; // BUG: TooFewBranchesForASwitchStatement
    }
}