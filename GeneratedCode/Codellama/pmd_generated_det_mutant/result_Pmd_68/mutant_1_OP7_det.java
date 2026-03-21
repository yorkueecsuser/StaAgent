import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        boolean cfotakio = false;while (cfotakio && false && true && false && false && true && false && true && false && false && true && false) {String pgtwdgna = "wlzrpvtl";}
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