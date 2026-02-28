import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }
    
    // Mutant Code
    public boolean alwaysFalse() {
        return false;
    }

    public void showMutant() {
        while (alwaysFalse()) {
            // Unreachable code
            System.out.println("This code is unreachable due to the always false condition in the while loop.");
        }
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();

        System.out.println(bug.showBug("Hello"));
        bug.showMutant();
    }
}