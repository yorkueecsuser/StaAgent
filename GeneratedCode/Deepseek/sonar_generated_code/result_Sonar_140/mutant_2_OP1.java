import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;
        String deadStore1 = "abcdefgh"; // Mutation: Inserting unused variable declarations

        i = i++; // BUG: Values should not be uselessly incremented

        String deadStore2 = "ijklmnop"; // Mutation: Inserting unused variable declarations
        return new int[]{j++}; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
    }
}