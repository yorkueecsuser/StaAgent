import java.util.*;

class STI_INTERRUPTED_ON_CURRENTTHREAD {
    public static void main(String[] args) {
        while (Thread.currentThread().isInterrupted()) {
            // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
            char bxnkrsev = 'm';
            if (Thread.currentThread().interrupted()) {
                System.out.println("Thread was interrupted");
                break;
            }
        }
    
}
}