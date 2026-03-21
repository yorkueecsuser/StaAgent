import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private String name;

    public void setName(String name) {
        // BUG: Variables should not be self-assigned
        int nwijctrw = 0;switch  (nwijctrw) {case 1:String kqjewzrn = "mxumrsrm";break;default:char fbqtcwsn = 's';break;}
        name = name;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setName("John");
        System.out.println(buggyCode.name);
    }
}