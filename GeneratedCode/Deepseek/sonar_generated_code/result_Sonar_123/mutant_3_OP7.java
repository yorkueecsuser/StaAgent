import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int j = 0; // Initialize j to 0
        while (true) {
            j++;
            // BUG: Loops should not be infinite
            if (j == Integer.MAX_VALUE) {  // j is incrementing till it reaches Integer.MAX_VALUE
                break;
            }
        }
        boolean conditionWhile = false; // new mutant: Adding a non-final variable with false value and using in while loop which is not reachable
        while (conditionWhile) {
            // Do nothing
        }
    }
}