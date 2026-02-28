import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");
        
        // Mutant: Duplicated StringBuffer creation
        StringBuffer sbMutant = new StringBuffer();
        sbMutant.append("Some String");

        // Mutant: Duplicated append operation
        sbMutant.append(" Some additional String");

        // BUG: UseStringBufferLength
        if (sbMutant.toString().equals("")) {
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