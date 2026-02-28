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

// Mutation: Renaming a user-defined variable
class MyThreadMutant extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThreadMutant t = new MyThreadMutant(); // Renamed variable 'thread' to 't'
        t.start(); // This will not execute doSomething() because run method is not overridden
    }

    public static void main(String[] args) {
        MyThreadMutant m = new MyThreadMutant(); // Renamed variable 'myThread' to 'm'
        m.showBug();
    }
}