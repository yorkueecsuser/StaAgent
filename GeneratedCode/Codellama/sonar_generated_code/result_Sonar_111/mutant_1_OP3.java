import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            if (false) {
                System.out.println("This line should not be printed");
            }
        }
    }
}