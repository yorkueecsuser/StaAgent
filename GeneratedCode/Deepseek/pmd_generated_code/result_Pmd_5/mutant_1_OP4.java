import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // Mutant Code Insertion: Unreachable If-Else Statement
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            // Unreachable Code: If condition is always false
            if (false) {
                // Code Block
            } else {
                // Code Block
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    }
}