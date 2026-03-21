import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        if (false && false && true && false && true && false && false && false && true && true && false) {short mqxgjcgb = -9979;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}