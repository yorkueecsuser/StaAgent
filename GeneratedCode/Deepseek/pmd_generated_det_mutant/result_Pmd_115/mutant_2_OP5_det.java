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
    }

    public int showBug() {
int qorighkt = 0;switch  (qorighkt) {case 1:short msfdlwcn = -1621;break;default:float ydfthkzo = 400096718;break;}

        return 0; // BUG: TooFewBranchesForASwitchStatement
    
}
}