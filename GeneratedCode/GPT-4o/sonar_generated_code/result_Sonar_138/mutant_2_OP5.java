class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden

        // Unreachable switch statement
        int unreachableCondition = getCondition();
        switch (unreachableCondition) {
            case 1: 
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
    }

    private int getCondition() {
        return 0; // This ensures that the case statements are unreachable
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}