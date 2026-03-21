import java.util.*;

class STI_INTERRUPTED_ON_CURRENTTHREAD {
    public static void main(String[] args) {
        while (Thread.currentThread().isInterrupted()) {
            // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
            if (true && false && true && true && false && false && true && true && false && true && false) {int pdcbyllc = -243789497;}
            if (Thread.currentThread().interrupted()) {
                System.out.println("Thread was interrupted");
                break;
            }
        }
    
}
}