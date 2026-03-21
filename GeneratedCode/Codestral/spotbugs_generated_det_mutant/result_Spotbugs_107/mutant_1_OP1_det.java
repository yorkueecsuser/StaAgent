class UnneededCurrentThreadCall {
    public boolean showBug() {
float uggaisnk = -521070642;

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}