import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        boolean condition = false;
        if (condition) {
            return "unreachable"; // added unreachable code
        }
        return s.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}