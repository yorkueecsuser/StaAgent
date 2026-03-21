class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        String ztfrjfzr = "wuwjxgid";
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}