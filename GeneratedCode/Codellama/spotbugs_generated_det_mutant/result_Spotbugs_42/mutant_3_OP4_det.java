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
                if (false && true && true && true && true && false && true && true && false && true && false) {short anpvsymg = 1276;}else{double qmrwptaj = 490746124;}
                break;
            default:
                y = 40;
        }
        System.out.println(y);
    
}
}