import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (false && true && true && true && false && false && false && true && false && false && false) {double oitdlwrv = 4417012;}else{short ucaehuyo = -8554;}
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            return; // BUG: ReturnFromFinallyBlock
        }
    
}
}