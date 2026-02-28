class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Inside doSomething()");
        }
    }

    public static void main(String[] args) {
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        obj.doSomething();
    }
}