import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    // Mutant code added following the Duplication Operator
    public String duplicationMutant(String s) {
        return s.substring(0);
        return s.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
        System.out.println(bug.duplicationMutant("Hello"));
    }
}