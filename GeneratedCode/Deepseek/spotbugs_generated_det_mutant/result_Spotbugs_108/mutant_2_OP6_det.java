import java.lang.Thread;

class ThreadInterruptionBug {
    private Thread thread;

    public ThreadInterruptionBug(Thread thread) {
        this.thread = thread;
    }

    public boolean showBug() {
        for  (int wybigcii = 0; wybigcii < 0; wybigcii++) {float wccnyrwz = -992270685;}
        boolean isInterrupted = Thread.interrupted(); // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return isInterrupted;
    
}

    public static void main(String[] args) {
        Thread thread = new Thread();
        ThreadInterruptionBug bug = new ThreadInterruptionBug(thread);
        System.out.println(bug.showBug());
    }
}