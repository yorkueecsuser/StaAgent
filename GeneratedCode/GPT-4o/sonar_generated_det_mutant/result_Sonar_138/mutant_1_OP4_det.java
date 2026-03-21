class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        if (true && true && true && true && true && true && true && false && false && true && false) {boolean pthauamw = true;}else{char bkauxiuf = 'e';}
        MyThread myThread = new MyThread();
        myThread.start(); // This will not perform any action because run() is not overridden
    
}

    public static void main(String[] args) {
        MyThread myThreadInstance = new MyThread();
        myThreadInstance.showBug();
    }
}