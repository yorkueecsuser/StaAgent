import java.util.Arrays;

class SubstringBug {
    boolean conditionFor = false;

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    public void unreachableWhileLoop() {
        while (conditionFor) {
            System.out.println("Unreachable loop");
        }
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        bug.unreachableWhileLoop();
        System.out.println(bug.showBug("Hello"));
    }
}