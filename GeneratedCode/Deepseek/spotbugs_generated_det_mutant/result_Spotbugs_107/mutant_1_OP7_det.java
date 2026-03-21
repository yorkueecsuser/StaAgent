import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        boolean ybajlesc = false;while (ybajlesc && true && false && false && true && true && false && true && true && true && false && false) {byte pycnvozt = -67;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}