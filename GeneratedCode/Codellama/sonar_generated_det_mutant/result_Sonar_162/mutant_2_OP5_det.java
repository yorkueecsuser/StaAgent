import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private String name;

    public void setName(String name) {
        // BUG: Variables should not be self-assigned
        int gccqkoat = 0;switch  (gccqkoat) {case 1:double citsazhb = 760833995;break;default:int wvbgysri = -238721573;break;}
        name = name;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setName("John");
        System.out.println(buggyCode.name);
    }
}