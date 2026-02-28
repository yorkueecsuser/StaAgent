class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Inserting an unreachable while loop
        boolean isUnreachable = getCondition();
        while (isUnreachable) {
            System.out.println("This is unreachable code.");
        }
    }

    private boolean getCondition() {
        return false; // This method is used to simulate an unreachable while loop
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}