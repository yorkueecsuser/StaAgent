import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        double qxtxgpqq = -315964725;
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}