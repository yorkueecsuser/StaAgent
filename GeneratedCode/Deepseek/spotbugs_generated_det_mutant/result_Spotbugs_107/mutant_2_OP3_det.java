import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        if (true && false && true && false && true && false && false && true && true && false && false) {long fyldfecu = -567719872;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}