import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented

        return new int[]{j++}; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case false: // Unreachable branch
                System.out.println("Unreachable branch");
                break;
            case true: // Reachable branch
                System.out.println("Reachable branch");
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}