import java.lang.Thread;
import java.lang.ThreadGroup;

class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        
        // Mutation Operator: Unreachable for loop
        // Mutation Operator description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        for(int i = 0; false; i++) {
            // Mutation: Inserting unreachable code inside the loop to avoid unreachable statement error.
            // This code will not be executed as the loop condition is always false.
            System.out.println("This code is unreachable");
        }
    }

    public void showBug() {
        buz();
    }
}