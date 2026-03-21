class UnneededCurrentThreadCall {
    public boolean showBug() {
int wwuktqdi = 0;switch  (wwuktqdi) {case 1:char krlswiql = 'b';break;default:float dclwyorp = -155288924;break;}

        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}
}