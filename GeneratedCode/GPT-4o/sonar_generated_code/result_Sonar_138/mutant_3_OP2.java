class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    private int exampleVariable = 0; // Example assignment statement

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread thread = new MyThread();
        thread.start(); // This will not execute doSomething() because run method is not overridden
    }

    public void demonstrateDuplication() {
        exampleVariable = 5; // Original assignment statement
        exampleVariable = 5; // Duplicated assignment statement
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.showBug();
    }
}