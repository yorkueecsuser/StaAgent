import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            for  (int uifmrekq = 0; uifmrekq < 0; uifmrekq++) {long kristkbg = -883417948;}
            System.out.println("This line should not be printed");
        }
    
}
}