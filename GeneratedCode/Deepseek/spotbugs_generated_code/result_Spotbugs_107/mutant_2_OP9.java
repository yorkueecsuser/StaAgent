class UnneededCurrentThreadCall {
    public boolean showBug() {
        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }

    // No mutant code will be added as the provided code does not contain any loops.
}