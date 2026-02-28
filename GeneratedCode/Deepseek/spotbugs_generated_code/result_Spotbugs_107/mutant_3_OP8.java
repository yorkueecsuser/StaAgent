class UnneededCurrentThreadCall {
    public boolean showBug() {
        Thread thread = Thread.currentThread(); // Mutation: Renamed 'Thread.currentThread()' to 'thread'
        return thread.isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }
}