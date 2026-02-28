import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented

        // Mutant: Adding an unreachable while loop
        boolean conditionWhile = true;
        while (conditionWhile) {
            conditionWhile = false;
            break;
        }

        // Mutant: Adding an unreachable while loop
        boolean conditionWhile2 = true;
        while (conditionWhile2) {
            conditionWhile2 = false;
            break;
        }

        return new int[]{j++}; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}