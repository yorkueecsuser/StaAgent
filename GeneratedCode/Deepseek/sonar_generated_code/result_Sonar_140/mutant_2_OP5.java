import java.util.Arrays;

class BugExample {
    private final boolean alwaysFalse = false; // Mutant Code

    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented

        return new int[]{j++}; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));

        // Mutant Code
        switch (bugExample.alwaysFalse) { // Mutant Code
            case true: // Mutant Code
                System.out.println("Switch statement is always true"); // Mutant Code
                break; // Mutant Code
            default: // Mutant Code
                System.out.println("Switch statement is always false"); // Mutant Code
                break; // Mutant Code
        } // Mutant Code
    }
}