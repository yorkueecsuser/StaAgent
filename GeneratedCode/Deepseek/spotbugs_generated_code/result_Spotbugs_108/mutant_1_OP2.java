class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        return Thread.interrupted();
    }
}