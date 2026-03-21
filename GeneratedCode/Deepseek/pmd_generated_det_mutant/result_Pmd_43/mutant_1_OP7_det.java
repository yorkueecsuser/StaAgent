class Main {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();
    }
}

class BuggyClass {
    protected void finalize() {
        System.out.println("Calling finalize");
        boolean juilnaed = false;while (juilnaed && false && false && false && false && true && true && true && true && false && false && false) {boolean tqixmpsf = false;}
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