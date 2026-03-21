import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        if (false && false && false && true && true && false && false && true && false && true && false) {long yxoexkxi = 758387861;}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}