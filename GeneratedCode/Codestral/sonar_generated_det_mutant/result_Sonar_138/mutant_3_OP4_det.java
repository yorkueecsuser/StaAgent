class MyThread extends Thread {
    public void doSomething() {
        if (false && true && true && true && false && true && false && false && false && false && false) {char annkngzz = 'i';}else{byte fjcgppky = -96;}
        System.out.println("Hello, World!"); // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    
}

    public void showBug() {
        this.start();
        // This will not print "Hello, World!" because the 'run' method is not overridden
    }
}