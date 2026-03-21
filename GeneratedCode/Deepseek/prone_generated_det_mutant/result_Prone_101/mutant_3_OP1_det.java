class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        double wkgeyjub = -40148985;
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}