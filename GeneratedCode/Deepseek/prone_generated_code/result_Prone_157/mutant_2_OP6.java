import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    // Mutant Code
    boolean conditionFor = true;
    for (int i = 0; conditionFor; i++) {
        // Dummy code to ensure the loop is unreachable
        if (i > 10) {
            conditionFor = false;
        }
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}