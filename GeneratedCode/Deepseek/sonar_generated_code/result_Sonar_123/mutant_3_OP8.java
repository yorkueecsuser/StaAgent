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

        int k = 0; // Mutant: Renaming j to k
        while (true) {
            k++;
            // BUG: Loops should not be infinite
            // Mutant: Renaming j to k
            if (k == Integer.MAX_VALUE) {
                break;
            }
        }
    }
}