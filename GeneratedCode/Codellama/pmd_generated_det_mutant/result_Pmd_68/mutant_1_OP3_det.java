import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        if (false && true && false && true && true && true && false && false && false && false && false) {long nzwmusxa = 136304485;}
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            return; // BUG: ReturnFromFinallyBlock
        }
    
}
}