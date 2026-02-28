import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");

        // BUG: UseStringBufferLength
        // Mutation Operator: Unreachable if statement
        // Mutation Operator Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            return "StringBuffer is empty";
        } else {
            return "StringBuffer is not empty";
        }
    }

    public static void main(String[] args) {
        BugUseStringBufferLength bug = new BugUseStringBufferLength();
        System.out.println(bug.showBug());
    }
}