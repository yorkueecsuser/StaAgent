import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        if (true && true && false && false && true && true && false && false && false && true && false) {byte eykcwswt = -14;}else{double nuvwesic = 383164691;}
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    
}
}