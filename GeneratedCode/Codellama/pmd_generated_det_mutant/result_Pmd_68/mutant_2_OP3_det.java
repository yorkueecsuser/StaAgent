import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        if (true && false && true && true && true && true && true && true && true && false && false) {byte miysokvw = 18;}
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            return; // BUG: ReturnFromFinallyBlock
        }
    
}
}