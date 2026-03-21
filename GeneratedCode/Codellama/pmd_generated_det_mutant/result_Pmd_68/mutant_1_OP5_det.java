import java.util.Scanner;

class ReturnFromFinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        int saexfrrh = 0;switch  (saexfrrh) {case 1:String ilbloofp = "vdblwzzr";break;default:long blmovwvd = -537325954;break;}
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            return; // BUG: ReturnFromFinallyBlock
        }
    
}
}