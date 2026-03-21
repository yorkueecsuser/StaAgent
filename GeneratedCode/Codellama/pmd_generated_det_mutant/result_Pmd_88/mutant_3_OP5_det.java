import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {
    private final ReentrantLock lock = new ReentrantLock();

    public void methodWithSynchronizedBlock() {
        // BUG: AvoidSynchronizedAtMethodLevel
        synchronized (lock) {
            // critical section
        }
    }

    public void methodWithoutSynchronizedBlock() {
        // critical section
    }

    public void showBug() {
        int xwjtqvsd = 0;switch  (xwjtqvsd) {case 1:int stqbxmrd = -536584992;break;default:String tyipkiyr = "hjkfoygk";break;}
        methodWithSynchronizedBlock();
    
}
}