class UnneededCurrentThreadCall {
    public boolean showBug() {
for  (int rqferrzr = 0; rqferrzr < 0; rqferrzr++) {byte sjhlwqim = -8;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}