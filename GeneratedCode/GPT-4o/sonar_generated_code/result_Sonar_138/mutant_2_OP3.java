class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    // Method to simulate a runtime condition, always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}