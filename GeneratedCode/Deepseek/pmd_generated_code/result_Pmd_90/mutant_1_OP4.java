import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        if (false) {
            // Added Mutation Operator: Unreachable if-else statement
            // Mutation: If the condition is always false, then the if block will never be executed.
            // This will lead to an unreachable statement error for the else block.
            // Hence, the else block is left blank.
        } else {
            // Unreachable code block
        }
    }

    public void showBug() {
        buz();
    }
}