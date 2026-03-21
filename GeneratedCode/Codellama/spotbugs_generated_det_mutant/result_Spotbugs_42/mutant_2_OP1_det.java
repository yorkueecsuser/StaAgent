import java.util.Scanner;

class DeadStoreBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int tpnztslv = -509552011;
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