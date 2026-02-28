import java.util.Arrays;

class SubstringBug {

    public String showBug(String s) {
        return s.substring(0);
    }

    public String UnreachableIfElse() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            return "This is an unreachable branch.";
        } else {
            return "This is the original code.";
        }
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
        System.out.println(bug.UnreachableIfElse());
    }
}