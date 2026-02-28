import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug(String s) {
        foo(s);
        boolean conditionFor = getCondition(); // added function call to determine loop condition
        for (int i = 0; conditionFor; i++) { // unreachable for loop
            System.out.println("Unreachable loop iteration: " + i);
        }
        System.out.println(f);
    }

    private boolean getCondition() {
        return false; // always return false to make the loop unreachable
    }
}