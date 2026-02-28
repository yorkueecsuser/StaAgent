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
    }

    public int[] showBugMutant() {
        int a = 0; // Mutation of variable `i`
        int b = 0; // Mutation of variable `j`

        a = a++; // Mutation of increment operator

        return new int[]{b++}; // Mutation of increment operator
    }
}