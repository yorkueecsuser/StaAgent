class UnneededCurrentThreadCall {
    public boolean showBug() {
short xemnabet = 7421;

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}