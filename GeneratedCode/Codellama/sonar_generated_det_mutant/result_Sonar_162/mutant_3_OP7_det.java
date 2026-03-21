import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private String name;

    public void setName(String name) {
        // BUG: Variables should not be self-assigned
        boolean lrnmaugc = false;while (lrnmaugc && false && false && false && true && false && true && true && false && true && false && false) {float jxzsbitg = -100100034;}
        name = name;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setName("John");
        System.out.println(buggyCode.name);
    }
}