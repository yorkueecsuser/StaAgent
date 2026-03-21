import java.util.Scanner;

class TooFewBranchesForSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a dgmziyek: ");
        int dgmziyek = scanner.nextInt();
        switch (dgmziyek) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            default:
                System.out.println("You entered something else");
                break;
        }
    }
}