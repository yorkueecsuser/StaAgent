import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        if (true && true && false && true && true && false && false && false && false && true && false) {short ijmulxau = 24;}else{double uqevmjta = -840842502;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}