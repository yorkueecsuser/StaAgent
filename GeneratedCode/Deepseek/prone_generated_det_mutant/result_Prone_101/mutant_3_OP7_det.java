class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        boolean geijhhyq = false;while (geijhhyq && false && true && false && false && true && false && true && false && true && false && false) {boolean qzteekhn = false;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}