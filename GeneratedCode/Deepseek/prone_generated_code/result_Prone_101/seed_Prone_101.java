class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    }
}