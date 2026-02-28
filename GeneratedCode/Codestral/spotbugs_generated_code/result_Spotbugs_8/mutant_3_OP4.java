import java.util.HashSet;

class BuggyCode {
    private boolean getCondition() {
        return false;
    }

    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // Original bug: A collection is added to itself

        // Mutation: Adding unreachable if-else statement
        if (getCondition()) {
            System.out.println("This code will never be executed.");
        } else {
            // This else block is unreachable, but we need to include it to avoid a compile error
            System.out.println("This code is also unreachable.");
        }

        return buggySet;
    }

    public void demonstrateBug() {
        HashSet<Object> buggySet = showBug();
        System.out.println(buggySet.hashCode()); // Throws StackOverflowError
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.demonstrateBug();
    }
}