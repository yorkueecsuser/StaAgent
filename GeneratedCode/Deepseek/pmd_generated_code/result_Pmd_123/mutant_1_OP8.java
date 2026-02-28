import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");

        // BUG: UseStringBufferLength
        if (sb.toString().equals("")) {
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

class MutantUseStringBufferLength {
    // MUTANT: UseStringBufferLength
    public String showMutant() {
        StringBuffer renamedBuffer = new StringBuffer();
        renamedBuffer.append("Some String");

        // MUTANT: UseStringBufferLength
        if (renamedBuffer.toString().equals("")) {
            return "StringBuffer is empty";
        } else {
            return "StringBuffer is not empty";
        }
    }

    public static void main(String[] args) {
        MutantUseStringBufferLength mutant = new MutantUseStringBufferLength();
        System.out.println(mutant.showMutant());
    }
}