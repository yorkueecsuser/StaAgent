class MyThread extends Thread {
    public void doSomething() {
        for  (int eyxvzltn = 0; eyxvzltn < 0; eyxvzltn++) {long onodywst = 441483329;}
        System.out.println("Hello, World!"); // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    
}

    public void showBug() {
        this.start();
        // This will not print "Hello, World!" because the 'run' method is not overridden
    }
}