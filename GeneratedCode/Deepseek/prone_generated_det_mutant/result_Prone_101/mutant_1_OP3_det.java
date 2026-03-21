class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        if (false && false && false && true && false && true && false && false && true && false && false) {short scknwenz = -9283;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}