import java.lang.Thread;

class ThreadInterruptionBug {
    private Thread thread;

    public ThreadInterruptionBug(Thread thread) {
        this.thread = thread;
    }
public boolean showBug() {
    boolean isInterrupted = Thread.interrupted();
    isInterrupted = Thread.interrupted();
    return isInterrupted;
}

    public static void main(String[] args) {
        Thread thread = new Thread();
        ThreadInterruptionBug bug = new ThreadInterruptionBug(thread);
        System.out.println(bug.showBug());
    }
}