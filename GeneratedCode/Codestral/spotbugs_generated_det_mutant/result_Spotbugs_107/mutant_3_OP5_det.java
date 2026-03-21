class UnneededCurrentThreadCall {
    public boolean showBug() {
int qaunvmfb = 0;switch  (qaunvmfb) {case 1:double ggtdnrjb = -632736827;break;default:short xqfxtrnm = -4202;break;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}