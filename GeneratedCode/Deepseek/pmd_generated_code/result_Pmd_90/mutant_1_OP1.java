import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        String deadStore1 = "abcdefgh"; // Added Dead Store Mutation
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        String deadStore2 = "ijklmnop"; // Added Dead Store Mutation
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        String deadStore3 = "qrstuvwx"; // Added Dead Store Mutation
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        String deadStore4 = "yz0123456"; // Added Dead Store Mutation
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        String deadStore5 = "789vbnmlo"; // Added Dead Store Mutation
    }

    public void showBug() {
        buz();
    }
}