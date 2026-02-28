import java.util.HashSet;

class BuggyCode {
    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        HashSet<Object> duplicatedSet = buggySet; // Mutation: Duplication
        buggySet.add(duplicatedSet); // This line is added to maintain the original bug
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