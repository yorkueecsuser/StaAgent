import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented

        // Unreachable for loop mutation
        for (int k = 0; k < 0; k++) { 
            // Add some statements to make it reachable
            i = i * 2;
        }

        return new int[]{j++}; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}