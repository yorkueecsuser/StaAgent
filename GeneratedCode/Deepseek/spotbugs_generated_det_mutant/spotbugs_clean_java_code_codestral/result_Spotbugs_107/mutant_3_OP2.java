class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean isInterrupted = Thread.currentThread().isInterrupted(); // original code
        boolean duplicateCheck = Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread(), added mutant
        return isInterrupted;
    }
}