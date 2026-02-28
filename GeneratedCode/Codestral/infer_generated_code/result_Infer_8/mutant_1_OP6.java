import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is an unreachable loop");
        }
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    }

    // A method to return false for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}