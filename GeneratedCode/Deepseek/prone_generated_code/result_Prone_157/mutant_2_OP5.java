import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    // Unreachable switch statement Mutant
    public String showBugMutant(String s) {
        switch (0) {
            case 1:
                System.out.println("Unreachable");
                break;
        }
        return s.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
        System.out.println(bug.showBugMutant("Hello"));
    }
}