import java.util.HashSet;

class BuggyCode {
    // Method that always returns false
    public boolean getCondition() {
        return false;
    }

    public HashSet<Object> showBug() {
        HashSet<Object> buggySet = new HashSet<>();
        buggySet.add(buggySet); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)

        // Added mutant code: An unreachable switch statement
        int value = 0;
        switch(getCondition()? value : 1) {
            case 0:
                System.out.println("This line should never be executed.");
                break;
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