import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // BUG: AvoidBranchingStatementAsLastInLoop (Line 18)
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    }

    // Mutated code
    public int[] renameBug() {
        int[] renamedArray = new int[10];
        // Mutated BUG: AvoidBranchingStatementAsLastInLoop (Line 18)
        for (int mutatedIndex = 0; mutatedIndex < 10; mutatedIndex++) {
            if (mutatedIndex*mutatedIndex <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return renamedArray;
    }
}