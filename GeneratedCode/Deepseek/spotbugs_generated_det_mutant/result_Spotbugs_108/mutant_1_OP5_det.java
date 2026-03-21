import java.lang.Thread;

class ThreadInterruptionBug {
    private Thread thread;

    public ThreadInterruptionBug(Thread thread) {
        this.thread = thread;
    }

    public boolean showBug() {
        int tuzeeaja = 0;switch  (tuzeeaja) {case 1:int kxrazeib = 66558139;break;default:boolean xyimtmtk = true;break;}
        boolean isInterrupted = Thread.interrupted(); // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return isInterrupted;
    
}

    public static void main(String[] args) {
        Thread thread = new Thread();
        ThreadInterruptionBug bug = new ThreadInterruptionBug(thread);
        System.out.println(bug.showBug());
    }
}