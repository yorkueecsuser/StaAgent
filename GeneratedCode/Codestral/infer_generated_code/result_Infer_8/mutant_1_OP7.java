import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop mutation
            /* Do nothing */
        }
        f = s;
    }

    private boolean getCondition() { // Dummy method to avoid using false directly
        return false;
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}