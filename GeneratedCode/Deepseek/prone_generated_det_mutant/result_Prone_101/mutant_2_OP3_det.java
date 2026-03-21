class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        if (true && true && false && false && false && true && true && false && true && false && false) {double ytrjyjir = 508089550;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}