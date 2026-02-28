import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        i = i++; // Mutated Line

        return new int[]{j++}; // BUG: Values should not be uselessly incremented
        return new int[]{j++}; // Mutated Line
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}