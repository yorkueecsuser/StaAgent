import java.util.HashSet;

class BuggyCode {
    private boolean getCondition() {
        return false; // This method always returns false to make the loop unreachable
    }

    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)

        // Unreachable for loop mutation operator
        for (int i = 0; getCondition(); i++) {
            System.out.println("This code should never be executed");
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