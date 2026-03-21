class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        if (true && false && true && true && false && false && false && false && false && false && false) {boolean paoxpqff = false;}else{short lqyllmpa = 9453;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}