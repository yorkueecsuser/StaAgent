class UnneededCurrentThreadCall {
    public boolean showBug() {
for  (int iatccfuq = 0; iatccfuq < 0; iatccfuq++) {String nlrupjyd = "tqopknrl";}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}