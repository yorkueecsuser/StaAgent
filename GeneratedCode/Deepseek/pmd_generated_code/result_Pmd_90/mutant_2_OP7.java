import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        boolean condition = getCondition();
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup

        // Added unreachable while loop with false condition.
        while (false) {
            // do nothing
        }
    }

    public void showBug() {
        buz();
    }

    // Utility method to generate non-constant condition.
    private boolean getCondition() {
        return false;
    }
}