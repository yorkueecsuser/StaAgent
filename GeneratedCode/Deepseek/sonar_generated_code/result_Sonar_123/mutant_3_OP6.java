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

        // Mutant Code
        boolean condition = false; // Initialize compile-time constant as non-final variable
        while (condition) {  // Use non-final variable in while loop condition
            // code
        }
    }
}