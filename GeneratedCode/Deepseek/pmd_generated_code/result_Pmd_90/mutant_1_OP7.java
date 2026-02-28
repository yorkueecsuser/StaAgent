import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup

        boolean condition = false; // This is a new line added for Unreachable while loop mutation
        while (condition) { // This is a new line added for Unreachable while loop mutation
            // This is a new line added for Unreachable while loop mutation
        }
    }

    public void showBug() {
        buz();
    }
}