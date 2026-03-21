import java.util.*;

class STI_INTERRUPTED_ON_CURRENTTHREAD {
    public static void main(String[] args) {
        while (Thread.currentThread().isInterrupted()) {
            // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
            int eigkjcco = 0;switch  (eigkjcco) {case 1:short ywzylfhe = -6398;break;default:short ykblszdm = 1270;break;}
            if (Thread.currentThread().interrupted()) {
                System.out.println("Thread was interrupted");
                break;
            }
        }
    
}
}