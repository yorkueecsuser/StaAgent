import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        if (false && true && true && true && false && false && false && false && false && false && false) {byte muftgkyq = -36;}else{String feinkkey = "bqojvlkt";}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}