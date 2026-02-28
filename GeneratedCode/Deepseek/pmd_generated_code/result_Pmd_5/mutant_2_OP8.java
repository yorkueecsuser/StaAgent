import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // MUTANT: Renaming used in loop variable i to j (Line 18)
        for (int j = 0; j < 10; j++) { // Mutation of "i" to "j"
            if (j*j <= 25) {
                continue;
            }
            break; // unchanged
        }
        return arr;
    }
}