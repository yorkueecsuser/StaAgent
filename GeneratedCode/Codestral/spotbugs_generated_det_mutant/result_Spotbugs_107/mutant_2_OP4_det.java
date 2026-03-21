class UnneededCurrentThreadCall {
    public boolean showBug() {
if (true && true && false && true && false && false && true && false && false && true && false) {short ojummupi = -7686;}else{int ymygbvva = 101996160;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}