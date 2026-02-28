class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Unreachable while loop mutation
        boolean conditionWhile = getConditionForWhile(); 
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }
    }

    public boolean getConditionForWhile() {
        return false; // This ensures the loop is unreachable
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}