import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        if (true && true && false && false && true && true && false && false && true && true && false) {boolean fecfynef = false;}else{float ftcbnjsb = 366469676;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}