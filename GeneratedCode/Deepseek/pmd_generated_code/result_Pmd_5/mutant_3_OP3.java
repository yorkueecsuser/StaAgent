import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // Mutated code: Unreachable if statement
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            if (i*i <= 25) {
                continue;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    }

    public boolean getCondition() {
        return false;
    }
}