class UnneededCurrentThreadCall {
    public boolean showBug() {
        return Thread.currentThread().isInterrupted(); // Original line
        return Thread.currentThread().isInterrupted(); // Mutant code: duplicated line
    }
}