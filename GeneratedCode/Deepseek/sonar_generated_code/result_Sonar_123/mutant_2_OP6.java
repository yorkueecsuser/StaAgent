import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int j = 0; // Initialize j to 0
        while (true) {
            j++;
            // Mutant Code: Adding an unreachable for loop
            for (int i = 0; getUnreachableCondition(); i++) {
                break;
            }

            // BUG: Loops should not be infinite
            if (j == Integer.MAX_VALUE) {  // j is incrementing till it reaches Integer.MAX_VALUE
                break;
            }
        }
    }

    public static boolean getUnreachableCondition() {
        return false;  // Unreachable as condition is always false
    }
}