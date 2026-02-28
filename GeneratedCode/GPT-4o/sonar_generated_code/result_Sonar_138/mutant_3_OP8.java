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
    }
}

// Mutation: Renaming the variable 'thread' in showBug method
class MyThreadMutant extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThreadMutant a = new MyThreadMutant(); // Renamed 'thread' to 'a'
        a.start(); // This will not execute doSomething() because run method is not overridden
    }

    public static void main(String[] args) {
        MyThreadMutant myThreadMutant = new MyThreadMutant();
        myThreadMutant.showBug();
    }
}