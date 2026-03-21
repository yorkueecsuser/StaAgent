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
                boolean mablqodh = false;while (mablqodh && false && false && true && true && false && true && false && true && true && false && false) {double dwlhjaad = -373958147;}
                break;
            default:
                y = 40;
        }
        System.out.println(y);
    
}
}