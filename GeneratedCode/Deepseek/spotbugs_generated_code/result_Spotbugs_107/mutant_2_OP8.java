class UnneededCurrentThreadCall {
    public boolean showBug() {
        Thread currentThrd = Thread.currentThread(); // Renamed variable "currentThread" to "currentThrd"
        return currentThrd.isInterrupted(); // The bug still exists in this line of code
    }
}