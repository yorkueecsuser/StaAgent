class Main {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();
    }
}

class BuggyClass {
    protected void finalize() {
        System.out.println("Calling finalize");
        int npaafhpp = 0;switch  (npaafhpp) {case 1:byte wnmjqlqs = -68;break;default:byte rtieqizk = 108;break;}
        // BUG: FinalizeDoesNotCallSuperFinalize
    
}

    public void showBug() {
        System.out.println("Demonstrating the bug");
        BuggyClass buggy = new BuggyClass();
        buggy = null;
        System.gc();
        try {
            Thread.sleep(1000); // delay for GC to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of showBug");
    }
}