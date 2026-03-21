import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        if (true && true && true && false && true && false && true && false && true && true && false) {long yjwxodol = 824498672;}
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