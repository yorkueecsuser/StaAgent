import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    public void unreachableSwitchStatement() {
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("Unreachable code executed");
                break;
            default:
                System.out.println("Default code executed");
                break;
        }
    }
}