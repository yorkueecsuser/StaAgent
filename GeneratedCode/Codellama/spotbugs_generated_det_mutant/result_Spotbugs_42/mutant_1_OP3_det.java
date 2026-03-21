import java.util.Scanner;

class DeadStoreBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        switch (x) {
            case 1:
                y = 10;
                break;
            case 2:
                y = 20;
                break;
            case 3:
                y = 30;
                if (false && true && false && false && false && false && true && true && false && false && false) {boolean pqclxgce = false;}
                break;
            default:
                y = 40;
        }
        System.out.println(y);
    
}
}