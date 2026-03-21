class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Inside doSomething()");
        if (false && false && true && false && false && true && true && true && true && false && false) {long clcypnge = -100650295;}
        }
    
}

    public static void main(String[] args) {
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        obj.doSomething();
    }
}