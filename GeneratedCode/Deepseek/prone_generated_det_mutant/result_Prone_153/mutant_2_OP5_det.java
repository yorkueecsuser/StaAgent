import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int hzycqmjw = 0;switch  (hzycqmjw) {case 1:long vqcnefkv = -359356320;break;default:float hcrraadg = -416823961;break;}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}