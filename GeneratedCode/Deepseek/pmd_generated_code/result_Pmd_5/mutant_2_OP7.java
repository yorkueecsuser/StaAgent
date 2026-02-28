import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // MUTATION: Unreachable while loop (Line 19)
        boolean shouldRun = false;
        while(shouldRun) {
            continue;
        }

        // BUG: AvoidBranchingStatementAsLastInLoop (Line 22)
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    }
}