class UnneededCurrentThreadCall {
    public boolean showBug() {
boolean hqrbmyss = false;while (hqrbmyss && true && true && false && false && true && false && true && false && true && false && false) {int jjpexecp = -995880081;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}