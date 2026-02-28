class UnneededCurrentThreadCall {
    public boolean showBug() {
        return Thread.currentThread().isInterrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted()
    }

    // No additional mutations applied, as the code does not contain any loops
}