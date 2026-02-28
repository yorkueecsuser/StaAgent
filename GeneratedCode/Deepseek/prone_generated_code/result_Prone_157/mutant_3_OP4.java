import java.util.Arrays;

class SubstringBug {

    public String showBug(String s) {
        boolean falseCondition = false;
        if (!falseCondition) {
            return s.substring(0);
        } else {
            return "This branch should not be reached";
        }
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}