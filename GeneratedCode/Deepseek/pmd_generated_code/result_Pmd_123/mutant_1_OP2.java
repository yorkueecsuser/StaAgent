import java.lang.StringBuffer;

class BugUseStringBufferLength {
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");
        StringBuffer sb2 = new StringBuffer();

        if (sb2.toString().equals("")) {
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