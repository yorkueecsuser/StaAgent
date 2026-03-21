class UnneededCurrentThreadCall {
    public boolean showBug() {
boolean xqshrjzf = false;while (xqshrjzf && false && true && false && true && false && true && true && true && true && false && false) {float tunhcjxx = -586939173;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}