import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // Mutation: Unreachable switch statement (Line 18)
        // The condition for the switch statement is always false, making it unreachable
        boolean conditionSwitch = false;
        switch (conditionSwitch? 1 : 0) {
            default:
                break;
        }
        return arr;
    }
}