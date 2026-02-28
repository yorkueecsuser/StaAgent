class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Mutation: Introduce an unreachable if branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print.");
        }
    }

    // Method to provide a false condition dynamically, avoiding compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}