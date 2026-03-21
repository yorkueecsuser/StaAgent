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
                int oklhijxk = 0;switch  (oklhijxk) {case 1:byte seovlfys = 32;break;default:float hxeahzmv = 369276868;break;}
                y = 30;
                break;
            default:
                y = 40;
        }
        System.out.println(y);
    
}
}