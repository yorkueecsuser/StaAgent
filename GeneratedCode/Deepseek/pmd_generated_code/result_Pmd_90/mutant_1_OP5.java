import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        
        // Mutant Code
        int value = getValue();
        switch (value) {
            case 1:
                break;
            default:
                break;
        }
    }

    public void showBug() {
        buz();
    }

    // Non-final variable for switch statement condition
    private int getValue() {
        return 1;
    }
}