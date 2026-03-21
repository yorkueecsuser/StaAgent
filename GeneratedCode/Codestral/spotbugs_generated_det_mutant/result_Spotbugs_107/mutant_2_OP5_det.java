class UnneededCurrentThreadCall {
    public boolean showBug() {
int dtxfjhkx = 0;switch  (dtxfjhkx) {case 1:char ghunpoiv = 'c';break;default:long ukagzeow = -306835819;break;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}