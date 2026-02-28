import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        boolean condition = false;
        if (condition) {
            return s.substring(0);
        }
        return "Unreachable Statement";
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}