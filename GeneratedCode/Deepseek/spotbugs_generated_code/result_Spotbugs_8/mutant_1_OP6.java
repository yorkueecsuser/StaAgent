import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        return buggySet;
    }

    public void demonstrateBug() {
        if (shouldRunUnreachableLoop()) {
            for (int i = 0; i < 10 && shouldRunUnreachableLoop(); i++) {
                // This loop is unreachable because the method shouldRunUnreachableLoop() always returns false.
            }
        }
        HashSet<Object> buggySet = showBug();
        System.out.println(buggySet.hashCode()); // Throws StackOverflowError
    }

    private boolean shouldRunUnreachableLoop() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.demonstrateBug();
    }
}