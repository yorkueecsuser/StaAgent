class UnneededCurrentThreadCall {
    public boolean showBug() {
if (false && false && false && false && false && true && false && false && true && false && false) {double ffosoenu = 758654292;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}