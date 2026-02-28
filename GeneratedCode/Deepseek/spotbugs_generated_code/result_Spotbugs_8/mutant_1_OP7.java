import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        while (alwaysFalse()) {
            // Unreachable while loop
        }
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
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

    private static boolean alwaysFalse() {
        return false;
    }
}