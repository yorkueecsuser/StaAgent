class VirtualThreadBug {
    private Object lock = new Object();

    public void showBug() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            synchronized (lock) { // Noncompliant; use a platform thread instead
                System.out.println("setupOperations");
                System.out.println("dequeLogic");
            }
        });
    }

    public void showBug2() {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            if (false) { // Unreachable if statement
                synchronizedMethod();
            } else {
                defaultLogic();
            }
        });
    }

    synchronized void synchronizedMethod() {
        System.out.println("synchronizedMethod");
    }

    void defaultLogic() {
        System.out.println("defaultLogic");
    }
}