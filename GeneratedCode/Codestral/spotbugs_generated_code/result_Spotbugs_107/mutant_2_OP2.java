class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean isInterrupted = Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
        boolean isInterruptedDuplicate = Thread.currentThread().isInterrupted(); // Mutated code: Duplication of the bug
        return isInterrupted;
    }
}