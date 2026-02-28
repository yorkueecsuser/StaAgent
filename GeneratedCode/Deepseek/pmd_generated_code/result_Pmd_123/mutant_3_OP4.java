import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");

        // BUG: UseStringBufferLength
        // Mutant: Adding a never-reaching if-else statement
        if (sb.toString().equals("")) {
            return "StringBuffer is empty";
        } else {
            // Unreachable statement
            int i = 0;
            if (false) {
                i = 1;
            }
            return "StringBuffer is not empty";
        }
    }

    public static void main(String[] args) {
        BugUseStringBufferLength bug = new BugUseStringBufferLength();
        System.out.println(bug.showBug());
    }
}