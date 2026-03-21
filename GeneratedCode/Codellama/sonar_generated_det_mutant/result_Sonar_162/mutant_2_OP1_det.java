import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private String name;

    public void setName(String name) {
        // BUG: Variables should not be self-assigned
        int egkwflcr = -686618847;
        name = name;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setName("John");
        System.out.println(buggyCode.name);
    }
}