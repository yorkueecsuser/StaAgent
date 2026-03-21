class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        for  (int zjejevkh = 0; zjejevkh < 0; zjejevkh++) {char leehicpi = 'n';}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}