class UnneededCurrentThreadCall {
    public boolean showBug() {
if (true && false && true && false && true && true && true && true && true && true && false) {char ncnlgeoi = 'b';}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}