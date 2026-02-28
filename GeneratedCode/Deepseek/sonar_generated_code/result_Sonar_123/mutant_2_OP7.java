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

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This is a mutation that should not be reachable
            int k = 0;
            while (true) {
                k++;
                if (k == Integer.MAX_VALUE) {
                    break;
                }
            }
        }
    }

    // Method to get a condition for the mutant
    private static boolean getCondition() {
        return false;  // Unreachable while loop condition
    }
}