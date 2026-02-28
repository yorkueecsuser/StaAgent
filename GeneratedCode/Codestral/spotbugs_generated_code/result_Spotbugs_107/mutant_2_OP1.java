import java.util.Random;

class UnneededCurrentThreadCall {
    public boolean showBug() {
        // Introducing a dead store
        int unusedVariable = new Random().nextInt();
        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }
}