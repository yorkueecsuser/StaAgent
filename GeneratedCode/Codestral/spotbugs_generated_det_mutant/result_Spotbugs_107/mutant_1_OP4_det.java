class UnneededCurrentThreadCall {
    public boolean showBug() {
if (false && true && true && true && false && true && false && false && true && false && false) {short innzywcj = 4810;}else{int xffnzccp = -978168307;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}