import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    boolean getCondition() {
        return false;
    }

    int getValue() {
        return 0;
    }

    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        if(getCondition()) {
            tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        }
        else {
            // This else branch is made unreachable.
            tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        }
        if(getCondition()) {
            tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        }
        else {
            // This else branch is made unreachable.
            tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        }
    }

    public void showBug() {
        buz();
    }
}