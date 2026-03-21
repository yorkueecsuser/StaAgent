class UnneededCurrentThreadCall {
    public boolean showBug() {
for  (int uvdlbgub = 0; uvdlbgub < 0; uvdlbgub++) {short mifbpkrp = 3909;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}