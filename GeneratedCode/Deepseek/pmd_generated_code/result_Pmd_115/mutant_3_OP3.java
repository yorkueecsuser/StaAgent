import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 3: ");
        int choice = sc.nextInt();
        sc.close();

        boolean flag = false;
        if (flag) {
            // This block of code is unreachable
            System.out.println("This statement is unreachable and should be avoided.");
        } 
        else {
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
        }
    }

    public int showBug() {
        boolean flag = false;
        if (flag) {
            // This block of code is unreachable
            return 1;
        }
        else {
            return 0; 
        }
    }
}