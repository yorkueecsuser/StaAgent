import java.util.Arrays;

class SubstringBug {
    public String showBug(String s) {
        return s.substring(0);
    }

    // Unreachable for loop mutation
    public void unreachableForLoopMutation() {
        boolean condition = true;
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable for loop");
        }
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
        bug.unreachableForLoopMutation();
    }
}