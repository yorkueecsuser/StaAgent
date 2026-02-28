class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is reachable and will not be executed.");
        } else {
            System.out.println("This branch is also reachable and will not be executed.");
        }
    }

    // This method returns a runtime-determined value to ensure the if-else statement is not detected as unreachable.
    private boolean getCondition() {
        return false; // The method simulates a condition that is false at runtime.
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}