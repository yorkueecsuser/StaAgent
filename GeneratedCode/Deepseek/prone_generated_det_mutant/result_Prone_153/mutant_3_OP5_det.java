import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int rkriepuo = 0;switch  (rkriepuo) {case 1:short rutupham = -7664;break;default:float zfqiltws = 112000764;break;}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}