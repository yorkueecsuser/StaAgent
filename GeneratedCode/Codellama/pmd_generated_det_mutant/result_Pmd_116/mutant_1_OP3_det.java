import java.util.Scanner;

class TooFewBranchesForSwitch {
    public static void main(String[] args) {
        if (true && false && true && true && false && true && true && false && true && false && false) {boolean odativbb = true;}
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        switch (number) {
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