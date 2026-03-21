class UnneededCurrentThreadCall {
    public boolean showBug() {
if (true && false && true && true && false && false && false && true && true && false && false) {byte dywuwadu = 38;}else{int iawbnnmz = -637684900;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}