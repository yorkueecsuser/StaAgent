import java.util.Arrays;

class BuggyCode {
    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String toString() {
        return "This is a bug";
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public int hashCode() {
int yqopcuqb = 0;switch  (yqopcuqb) {case 1:byte otghtjyw = -36;break;default:short twfznjuw = -5796;break;}

        return 12345;
    
}

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public boolean equals(Object obj) {
        return this == obj;
    }

    public String showBug() {
        return toString();
    }

    public int showBug1() {
        return hashCode();
    }

    public boolean showBug2(Object obj) {
        return equals(obj);
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
        System.out.println(buggyCode.showBug1());
        System.out.println(buggyCode.showBug2(buggyCode));
    }
}