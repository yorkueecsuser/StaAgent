import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg1 = new ThreadGroup("My threadgroup"); // Mutant: Renaming tg to tg1
        ThreadGroup tg2 = new ThreadGroup(tg1, "my thread group"); // Mutant: Renaming tg to tg2
        ThreadGroup tg3 = Thread.currentThread().getThreadGroup(); // Mutant: Renaming tg to tg3
        ThreadGroup tg4 = System.getSecurityManager().getThreadGroup(); // Mutant: Renaming tg to tg4
    }

    public void showBug() {
        buz();
    }
}