import java.util.Scanner;

class ImplicitSwitchFallThrough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered 1");
            case 2: // BUG: ImplicitSwitchFallThrough
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                if (false && false && true && false && false && false && false && false && true && true && false) {byte mncvqavv = 118;}else{float grtykaio = -265482174;}
                System.out.println("Invalid input");
        }
    
}
}