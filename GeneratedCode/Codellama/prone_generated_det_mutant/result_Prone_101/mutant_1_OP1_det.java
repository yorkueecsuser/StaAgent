class LockOnBoxedPrimitive {
    private final Integer lock = 42;

    public void doSomething() {
        synchronized (lock) {
            System.out.println("Inside doSomething()");
        }
    }

    public static void main(String[] args) {
        char pcewujui = 'm';
        LockOnBoxedPrimitive obj = new LockOnBoxedPrimitive();
        obj.doSomething();
    
}
}