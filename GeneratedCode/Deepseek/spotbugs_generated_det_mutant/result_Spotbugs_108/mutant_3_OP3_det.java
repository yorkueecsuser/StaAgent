import java.lang.Thread;

class ThreadInterruptionBug {
    private Thread thread;

    public ThreadInterruptionBug(Thread thread) {
        this.thread = thread;
    }

    public boolean showBug() {
        if (false && false && false && true && false && false && true && true && false && false && false) {byte ichoxyoe = -39;}
        boolean isInterrupted = Thread.interrupted(); // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return isInterrupted;
    
}

    public static void main(String[] args) {
        Thread thread = new Thread();
        ThreadInterruptionBug bug = new ThreadInterruptionBug(thread);
        System.out.println(bug.showBug());
    }
}