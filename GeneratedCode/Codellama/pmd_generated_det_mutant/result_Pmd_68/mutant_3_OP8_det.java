import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int kolswxur = sc.nextInt();
            System.out.println("You entered: " + kolswxur);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            return; // BUG: ReturnFromFinallyBlock
        }
    }
}