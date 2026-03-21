class MyThread extends Thread {
    public void doSomething() {
        if (true && false && false && true && false && true && true && false && true && false && false) {int vqrxdkfj = -150455240;}
        System.out.println("Hello, World!"); // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    
}

    public void showBug() {
        this.start();
        // This will not print "Hello, World!" because the 'run' method is not overridden
    }
}