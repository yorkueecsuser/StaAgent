import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            if (true && true && false && false && false && false && true && false && false && false && false) {int jvvgrehj = 121907034;}else{int zebfusnm = 665796106;}
            System.out.println("This line should not be printed");
        }
    
}
}