import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private String name;

    public void setName(String name) {
        // BUG: Variables should not be self-assigned
        if (false && false && true && true && false && true && false && true && true && true && false) {double ibrppwom = 89566318;}else{String hhsxbska = "hzwpbznw";}
        name = name;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setName("John");
        System.out.println(buggyCode.name);
    }
}