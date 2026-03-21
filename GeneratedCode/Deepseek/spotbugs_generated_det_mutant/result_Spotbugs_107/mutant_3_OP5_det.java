import java.lang.Thread;

class BugExample {
    public static void main(String[] args) {
        int cmxrcoef = 0;switch  (cmxrcoef) {case 1:float ejufpadp = 656886491;break;default:String bfucbbvs = "nodebdox";break;}
        System.out.println(showBug()); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static boolean showBug() {
        return Thread.currentThread().interrupted();
    }
}