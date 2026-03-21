import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        if (true && false && false && true && false && true && false && false && true && false && false) {int ysvqayib = -456704849;}else{long dhibibgp = -770509966;}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}