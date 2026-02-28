import java.util.HashSet;

class BuggyCode {
    private boolean getCondition() {
        return false;
    }

    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)

        // Mutated code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never execute");
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