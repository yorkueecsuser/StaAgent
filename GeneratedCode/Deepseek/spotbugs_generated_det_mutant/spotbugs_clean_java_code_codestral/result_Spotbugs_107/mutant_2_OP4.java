class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute");
        } else {
            // Original code
            return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
        }
    }
}