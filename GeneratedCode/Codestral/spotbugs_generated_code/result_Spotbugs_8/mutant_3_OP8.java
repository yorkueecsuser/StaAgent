import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        return buggySet;
    }

    public void demonstrateBug() {
        HashSet<Object> renamedBuggySet = showBug(); // Renamed buggySet to renamedBuggySet
        System.out.println(renamedBuggySet.hashCode()); // Throws StackOverflowError
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.demonstrateBug();
    }
}