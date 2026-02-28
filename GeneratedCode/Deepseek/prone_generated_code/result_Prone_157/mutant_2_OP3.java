import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    // Mutated Code
    public String showBugMutant(String s) {
        boolean condition = false;
        if (condition) {
            return s.substring(0); 
        } else {
            System.out.println("This branch will never be executed"); 
        }
        return s; 
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
        System.out.println(bug.showBugMutant("Hello")); 
    }
}