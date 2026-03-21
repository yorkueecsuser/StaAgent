import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            if (true && true && false && true && true && false && false && true && true && false && false) {double mliexfxp = 971200426;}else{int czrdztph = 622761840;}
            System.out.println("This line should not be printed");
        }
    
}
}