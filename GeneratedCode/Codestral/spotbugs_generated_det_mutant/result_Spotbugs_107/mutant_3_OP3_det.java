class UnneededCurrentThreadCall {
    public boolean showBug() {
if (false && true && false && false && false && true && true && true && true && true && false) {double qfhrgean = 667888776;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}