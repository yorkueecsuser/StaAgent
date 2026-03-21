import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xwpmbwaz = 0;switch  (xwpmbwaz) {case 1:String rfqhyjrl = "amofyqnh";break;default:short uxplhtnq = 2766;break;}
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