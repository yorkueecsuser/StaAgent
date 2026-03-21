import java.util.*;

class STI_INTERRUPTED_ON_CURRENTTHREAD {
    public static void main(String[] args) {
        while (Thread.currentThread().isInterrupted()) {
            // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
            boolean gtmnfuit = false;while (gtmnfuit && false && false && false && true && false && true && false && true && false && false && false) {byte nmpyvpmu = 39;}
            if (Thread.currentThread().interrupted()) {
                System.out.println("Thread was interrupted");
                break;
            }
        }
    
}
}