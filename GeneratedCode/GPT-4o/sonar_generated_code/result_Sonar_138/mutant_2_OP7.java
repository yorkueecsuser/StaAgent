class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();

        // Adding unreachable while loop mutation
        boolean isConditionMet = getCondition(); // dynamically determined at runtime
        while (isConditionMet) {
            // This block is unreachable because isConditionMet is dynamically set to false
            System.out.println("This is unreachable code.");
        }
    }

    // Method to simulate a false condition at runtime
    private static boolean getCondition() {
        return false;
    }
}