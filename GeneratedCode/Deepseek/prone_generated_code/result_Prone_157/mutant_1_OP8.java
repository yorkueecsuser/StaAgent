import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String str) {
        return str.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}