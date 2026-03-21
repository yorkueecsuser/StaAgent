import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (true && false && true && true && false && true && true && true && false && false && false) {String avzddmfq = "rztgzuyz";}
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