import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            int ddduhzsz = 0;switch  (ddduhzsz) {case 1:String wcsmxyuh = "viwyhhue";break;default:byte jeqcsoqd = 103;break;}
            System.out.println("Buggy code executed");
        }
    
}
}