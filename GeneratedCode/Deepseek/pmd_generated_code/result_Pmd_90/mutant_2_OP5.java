import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        // Mutant code to avoid unreachable statement error
        int condition = 0;
        switch (condition) {
            case 0:
                break;
            default:
                break;
        }
    }

    public void showBug() {
        buz();
    }
}