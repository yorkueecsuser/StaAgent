import java.util.Scanner;

class NonCaseLabelInSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (true && false && false && false && false && true && true && false && true && true && false) {char aadkiygh = 'o';}else{boolean snjucneo = true;}
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose 1");
                break;
            case 2:
                System.out.println("You chose 2");
                break;
            default:
                System.out.println("You did not choose a valid option");
                break;
        }

        // BUG: NonCaseLabelInSwitch
        myLoop:
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i);
            if (i == 2) {
                break myLoop; // Non-case label used in switch statement
            }
        }
    
}
}