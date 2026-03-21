class MyThread extends Thread {
    public void doSomething() {
        if (false && false && true && true && true && true && false && false && true && true && false) {byte fzytiqpj = 55;}else{char zdmtofdk = 'y';}
        System.out.println("Hello, World!"); // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    
}

    public void showBug() {
        this.start();
        // This will not print "Hello, World!" because the 'run' method is not overridden
    }
}