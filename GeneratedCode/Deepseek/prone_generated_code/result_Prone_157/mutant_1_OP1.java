import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        String deadStore_1234abcd = "This is a dead store";
        return s.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}