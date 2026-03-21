import java.util.Scanner;

class DeadStoreBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (true && false && true && true && true && true && false && false && false && false && false) {int qqgwxaew = 417589971;}
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
                break;
            default:
                y = 40;
        }
        System.out.println(y);
    
}
}