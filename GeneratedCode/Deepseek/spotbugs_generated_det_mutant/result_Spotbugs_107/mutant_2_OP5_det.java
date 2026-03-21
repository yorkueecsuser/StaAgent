import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        int torjyhvx = 0;switch  (torjyhvx) {case 1:long bzehkkko = 77222386;break;default:short segmgiph = 5327;break;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}