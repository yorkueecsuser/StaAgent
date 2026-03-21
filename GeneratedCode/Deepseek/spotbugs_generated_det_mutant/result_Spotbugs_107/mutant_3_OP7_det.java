import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        boolean ooryqtlw = false;while (ooryqtlw && true && false && false && true && true && true && false && false && true && true && false) {boolean keywmlmy = false;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}