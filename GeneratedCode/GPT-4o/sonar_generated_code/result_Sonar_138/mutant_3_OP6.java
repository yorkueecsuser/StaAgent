class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Using a method to avoid compile-time constant
        
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    public static boolean getCondition() {
        return false; // This method is designed to always return false, making the loop unreachable
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}