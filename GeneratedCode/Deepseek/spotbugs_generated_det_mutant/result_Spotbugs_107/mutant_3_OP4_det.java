import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        if (false && true && true && true && false && true && true && true && false && true && false) {String bpozxmki = "xlrvhjop";}else{byte wekmbxnd = -115;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}