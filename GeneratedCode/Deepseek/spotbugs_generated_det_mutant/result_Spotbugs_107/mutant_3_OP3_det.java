import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        if (true && false && true && false && false && false && false && true && false && true && false) {int unjnexvp = -920997278;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}