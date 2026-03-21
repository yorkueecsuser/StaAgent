import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nvnzopvk = 0;switch  (nvnzopvk) {case 1:int qscgosxq = 913189059;break;default:double ptvgpcbo = -560677582;break;}
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