class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        boolean brxayaxe = false;while (brxayaxe && false && false && false && false && true && true && true && true && true && false && false) {String rxpwvlwm = "lfzbtgux";}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}