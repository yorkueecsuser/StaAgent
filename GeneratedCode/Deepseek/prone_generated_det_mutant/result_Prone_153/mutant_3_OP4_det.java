import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        if (true && true && false && true && false && true && true && false && false && true && false) {int kducywov = -722984283;}else{char edvyomws = 'e';}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}