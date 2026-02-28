import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar

        // Mutation Operator: Adding unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        boolean unreachable = false;
        while (unreachable) {
            // arbitrary code here to make the while loop unreachable
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}