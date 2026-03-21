class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        }
        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }
}