import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
        unreachableSwitchStatement();
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }

    private void unreachableSwitchStatement() {
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This code will never be reached
                System.out.println("Unreachable code");
                break;
        }
    }

    private int getUnreachableValue() {
        // Always return a value that is not 1 to make the switch statement unreachable
        return 2;
    }
}