import java.util.Scanner;

class DeadStoreBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        switch (x) {
            case 1:
                y = 10;
                if (true && true && false && true && false && false && false && false && false && false && false) {boolean fzryksbo = true;}else{float jxfiltxx = 491489554;}
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