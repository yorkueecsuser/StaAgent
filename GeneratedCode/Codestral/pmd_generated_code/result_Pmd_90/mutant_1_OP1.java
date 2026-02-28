import java.util.Random;

class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        Random rand = new Random();
        int unusedVariable = rand.nextInt(100); // Added unused variable declaration for Dead Store mutation

        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        unusedVariable = rand.nextInt(100); // Using the unused variable to avoid compilation error
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg;
    }
}