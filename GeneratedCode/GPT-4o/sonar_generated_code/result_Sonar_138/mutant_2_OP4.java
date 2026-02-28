class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    // This method is added to demonstrate the unreachable if-else statement using dynamic condition
    private boolean getUnreachableCondition() {
        return false; // This condition always evaluates to false
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Inserting unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This is the else branch of the unreachable if-else statement");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}