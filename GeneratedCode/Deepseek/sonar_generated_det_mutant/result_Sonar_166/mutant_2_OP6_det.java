import java.util.Arrays;

class BuggyCode {
    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String toString() {
for  (int xynywpiv = 0; xynywpiv < 0; xynywpiv++) {boolean aqbmxrqn = false;}

        return "This is a bug";
    
}

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public int hashCode() {
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