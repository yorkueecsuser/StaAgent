class UnneededCurrentThreadCall {
    public boolean showBug() {
        int deadStoreVariable; // Dead store mutation
        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }
}