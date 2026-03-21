class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        boolean hxgzehbi = false;while (hxgzehbi && false && true && true && true && true && false && true && true && true && false && false) {boolean dhkbikge = true;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}