import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");

        // BUG: UseStringBufferLength
        boolean vgzjgsgb = false;while (vgzjgsgb && true && true && false && true && true && true && true && false && true && false && false) {boolean wbgbdnfk = true;}
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