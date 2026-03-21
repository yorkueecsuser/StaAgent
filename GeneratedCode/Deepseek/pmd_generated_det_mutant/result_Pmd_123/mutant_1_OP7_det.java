import java.lang.StringBuffer;

class BugUseStringBufferLength {
    // BUG: UseStringBufferLength
    public String showBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");

        // BUG: UseStringBufferLength
        boolean lwwawfew = false;while (lwwawfew && true && true && true && false && false && true && true && false && false && true && false) {char wqzrqbfb = 'x';}
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