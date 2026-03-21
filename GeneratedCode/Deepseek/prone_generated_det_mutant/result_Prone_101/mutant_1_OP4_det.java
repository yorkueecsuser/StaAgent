class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        if (false && false && true && true && false && true && false && true && false && false && false) {float fzaaauwo = -490482545;}else{double dsfdmghq = -808335261;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}