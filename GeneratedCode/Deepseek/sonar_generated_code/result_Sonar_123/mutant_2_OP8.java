import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 0; // Initialize x to 0
        while (true) {
            x++;
            // BUG: Loops should not be infinite
            if (x == Integer.MAX_VALUE) {  // x is incrementing till it reaches Integer.MAX_VALUE
                break;
            }
        }
    }
}