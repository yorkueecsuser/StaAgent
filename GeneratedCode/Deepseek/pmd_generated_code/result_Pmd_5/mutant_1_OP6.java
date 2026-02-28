import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        boolean condition = true; // mutant: adding a non-final variable with static value to make sure that the loop is always true
        // BUG: AvoidBranchingStatementAsLastInLoop (Line 18)
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }

        // Mutant code
        for (int i = 0; condition; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }

        return arr;
    }
}