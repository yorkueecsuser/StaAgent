class UnneededCurrentThreadCall {
    public boolean showBug() {
boolean infeniwj = false;while (infeniwj && true && false && false && false && false && false && true && true && true && false && false) {float hbwnjuzj = -952474651;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}