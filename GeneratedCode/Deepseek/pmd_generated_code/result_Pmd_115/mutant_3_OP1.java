import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 3: ");
        int choice = sc.nextInt();
        sc.close();
        String deadStore1 = "abcdefgh"; // The mutation operator is Dead Store, inserting a dead store variable

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
        String deadStore2 = "ijklmnop"; // The mutation operator is Dead Store, inserting another dead store variable
    }

    public int showBug() {
        String deadStore3 = "qrstuvwx"; // The mutation operator is Dead Store, inserting a dead store variable
        return 0;
    }
}