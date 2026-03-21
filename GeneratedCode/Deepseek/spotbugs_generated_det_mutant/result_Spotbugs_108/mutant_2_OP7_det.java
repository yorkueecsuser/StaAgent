import java.lang.Thread;

class ThreadInterruptionBug {
    private Thread thread;

    public ThreadInterruptionBug(Thread thread) {
        this.thread = thread;
    }

    public boolean showBug() {
        boolean ipoylmkq = false;while (ipoylmkq && false && false && true && true && false && true && true && false && false && true && false) {char gheywmoe = 'h';}
        boolean isInterrupted = Thread.interrupted(); // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return isInterrupted;
    
}

    public static void main(String[] args) {
        Thread thread = new Thread();
        ThreadInterruptionBug bug = new ThreadInterruptionBug(thread);
        System.out.println(bug.showBug());
    }
}