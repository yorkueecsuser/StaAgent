import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        String kugmmbtd = "momufrvu";
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}