class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        for  (int oudhltdr = 0; oudhltdr < 0; oudhltdr++) {byte lhweefvk = -4;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}