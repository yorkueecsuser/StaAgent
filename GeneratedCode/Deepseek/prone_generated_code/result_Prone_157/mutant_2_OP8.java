import java.util.Arrays;

class SubstringBug {
    public String showBug(String a) {
        return a.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}