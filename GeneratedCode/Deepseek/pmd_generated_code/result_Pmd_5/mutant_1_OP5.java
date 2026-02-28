import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    public int[] showBug() {
        int[] arr = new int[10];
        // BUG: Unreachable switch statement (Line 18)
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            int switchValue = getSwitchValue();
            switch (switchValue) {
                case 1:
                    // do nothing
                    break;
                default:
                    break;
            }
            break; // unusual use of branching statement as last part of loop
        }
        return arr;
    }

    private int getSwitchValue() {
        return 0; // always return 0 to make switch unreachable
    }
}