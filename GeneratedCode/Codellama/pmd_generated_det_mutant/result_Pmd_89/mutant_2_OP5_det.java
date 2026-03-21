import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        int ekxaapsh = 0;switch  (ekxaapsh) {case 1:boolean hbwrvpom = false;break;default:int jlydmpjv = -682347134;break;}
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}