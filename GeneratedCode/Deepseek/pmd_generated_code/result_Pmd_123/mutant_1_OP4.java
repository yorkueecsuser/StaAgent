import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");

        // BUG: UseStringBufferLength
        if (sb.toString().equals("")) {
            return "StringBuffer is empty";
        } 
        // Mutant
        else if (false) {
            return "Unreachable StringBuffer is not empty";
        }
        else {
            return "StringBuffer is not empty";
        }
    }

    public static void main(String[] args) {
        BugUseStringBufferLength bug = new BugUseStringBufferLength();
        System.out.println(bug.showBug());
    }
}