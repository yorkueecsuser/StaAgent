import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        boolean alwaysTrue = true; 
        while(!alwaysTrue) {
            System.out.println("This line is unreachable.");
        }
        return s.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}