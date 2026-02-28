class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    // Adding a method to simulate a dynamic condition for the for loop
    public boolean getCondition() {
        return false; // This will make the loop conditionally unreachable
    }

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Adding an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be printed.");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}