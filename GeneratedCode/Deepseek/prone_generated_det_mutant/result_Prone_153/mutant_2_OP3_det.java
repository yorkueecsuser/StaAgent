import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        if (true && false && false && true && true && true && false && true && true && true && false) {int egumxbzd = -654813793;}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}