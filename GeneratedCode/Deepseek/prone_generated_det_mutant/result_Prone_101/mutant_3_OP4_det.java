class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        if (true && true && true && false && false && true && true && false && false && true && false) {double tcecpmya = -508373728;}else{char gialvbrj = 'r';}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}