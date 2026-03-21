import java.util.*;

class STI_INTERRUPTED_ON_CURRENTTHREAD {
    public static void main(String[] args) {
        while (Thread.currentThread().isInterrupted()) {
            // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
            boolean tlbckjlo = false;while (tlbckjlo && true && false && true && false && true && true && true && true && false && true && false) {int nnhzzboa = 750954481;}
            if (Thread.currentThread().interrupted()) {
                System.out.println("Thread was interrupted");
                break;
            }
        }
    
}
}