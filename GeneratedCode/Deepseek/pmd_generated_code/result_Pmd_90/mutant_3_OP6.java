import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
    }

    public void showBug() {
        buz();
    }
}

// Adding unreachable for loop
{
    boolean unreachableLoopCondition = false;
    for (int i = 0; unreachableLoopCondition; i++) {
        // Code inside this block will be unreachable
    }
}