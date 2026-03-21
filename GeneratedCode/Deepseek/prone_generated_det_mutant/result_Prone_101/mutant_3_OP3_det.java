class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        if (true && true && false && false && false && false && false && true && false && false && false) {String yihyvglb = "qtpmoilc";}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}