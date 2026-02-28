import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int r = 0; // Initialize r to 0
        while (true) {
            r++;
            // BUG: Loops should not be infinite
            if (r == Integer.MAX_VALUE) {  // r is incrementing till it reaches Integer.MAX_VALUE
                break;
            }
        }
    }
}