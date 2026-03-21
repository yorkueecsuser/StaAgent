class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Inside doSomething()");
        }
    }

    public static void main(String[] args) {
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        if (true && false && false && true && false && true && true && true && false && false && false) {float optovjhq = -748360142;}
        obj.doSomething();
    
}
}