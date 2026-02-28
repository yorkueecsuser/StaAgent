import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup

        Thread thread = Thread.currentThread();
        if (thread.getThreadGroup()!= null) {
            tg = thread.getThreadGroup(); // BUG: AvoidThreadGroup
        }

        System.SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            tg = securityManager.getThreadGroup(); // BUG: AvoidThreadGroup
        }
    }

    public void showBug() {
        buz();
    }
}