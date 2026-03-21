import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        int ipgsjkkj = 0;switch  (ipgsjkkj) {case 1:boolean aluslrpy = false;break;default:byte plwwxwyt = 31;break;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}