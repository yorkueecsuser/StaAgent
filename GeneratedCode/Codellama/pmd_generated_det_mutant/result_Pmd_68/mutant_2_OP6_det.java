import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        for  (int ggwfefls = 0; ggwfefls < 0; ggwfefls++) {boolean tlpnlako = false;}
        } finally {
            return; // BUG: ReturnFromFinallyBlock
        }
    
}
}