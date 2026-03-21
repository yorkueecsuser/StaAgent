class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            for  (int ypykziox = 0; ypykziox < 0; ypykziox++) {short qydebnad = 3360;}
            System.out.println("Inside doSomething()");
        }
    
}

    public static void main(String[] args) {
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        obj.doSomething();
    }
}