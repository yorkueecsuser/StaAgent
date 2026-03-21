class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        int lulwvvvm = 75945729;
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}