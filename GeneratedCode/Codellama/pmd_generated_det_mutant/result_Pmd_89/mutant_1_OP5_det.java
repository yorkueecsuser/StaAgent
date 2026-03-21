import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        int vwgmwove = 0;switch  (vwgmwove) {case 1:float nepuxoti = -922499146;break;default:long hjheeegh = 226802502;break;}
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}