import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // original code

        // Mutant code
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code will never be executed, as the condition is always false
            System.out.println("This is an unreachable block of code");
        }
    }

    // This method is assumed to exist and returns a false value
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}