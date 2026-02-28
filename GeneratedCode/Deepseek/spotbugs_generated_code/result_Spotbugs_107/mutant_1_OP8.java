class UnneededCurrentThreadCall {
    public boolean showBug() {
        Thread t = Thread.currentThread();
        return t.isInterrupted(); // Bug: Unneeded use of currentThread() call

        // Mutant code: introducing a new variable and renaming it
        Thread a = Thread.currentThread();
        return a.isInterrupted();
    }
}