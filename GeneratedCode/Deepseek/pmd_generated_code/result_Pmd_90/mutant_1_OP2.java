import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        ThreadGroup tg2 = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        ThreadGroup tg3 = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        ThreadGroup tg4 = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
    }

    public void showBug() {
        buz();
    }
}