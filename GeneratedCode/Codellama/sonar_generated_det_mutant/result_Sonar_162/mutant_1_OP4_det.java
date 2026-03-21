import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private String name;

    public void setName(String name) {
        // BUG: Variables should not be self-assigned
        if (false && true && false && true && false && false && true && true && false && true && false) {String rusrxvmu = "jkaicnvi";}else{String hhylerss = "ezmjuajz";}
        name = name;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setName("John");
        System.out.println(buggyCode.name);
    }
}