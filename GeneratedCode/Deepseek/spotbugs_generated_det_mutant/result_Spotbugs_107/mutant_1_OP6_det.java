import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        for  (int fcltxlrt = 0; fcltxlrt < 0; fcltxlrt++) {short qwxayeoc = 9914;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}