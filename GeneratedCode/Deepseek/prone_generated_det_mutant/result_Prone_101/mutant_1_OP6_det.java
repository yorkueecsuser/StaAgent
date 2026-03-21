class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        for  (int jibqtpai = 0; jibqtpai < 0; jibqtpai++) {long frtazrnm = 427028240;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}