import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));

        boolean shouldRun = true;
        if (shouldRun) {
            System.out.println(bug.showBug("World"));
        } else {
            System.out.println("This branch is unreachable");
        }
    }
}