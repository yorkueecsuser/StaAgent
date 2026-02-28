class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden
        
        // Inserting unreachable if-else branch
        boolean condition = computeCondition(); // Method call to avoid compile-time constant
        if (condition) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("This else branch is also unreachable.");
        }
    }

    public boolean computeCondition() {
        return false; // Always false, making the if-else unreachable
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}