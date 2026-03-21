import java.util.Scanner;

class TooFewBranchesForSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("You entered 1");
                if (false && false && true && false && false && true && true && true && true && true && false) {byte txnjkueo = -50;}else{byte zwfzbplq = -101;}
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