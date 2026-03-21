import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        if (true && true && false && true && true && false && false && true && false && true && false) {float idzeotoa = 478924322;}else{short kdgsnoon = 7549;}
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
    
}

    public void showBug() {
        buz();
    }
}