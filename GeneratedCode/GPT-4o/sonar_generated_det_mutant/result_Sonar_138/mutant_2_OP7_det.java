class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        boolean xmudxzbt = false;while (xmudxzbt && true && false && false && true && false && true && true && false && true && true && false) {char brazoron = 'g';}
        MyThread myThread = new MyThread();
        myThread.start(); // This will not perform any action because run() is not overridden
    
}

    public static void main(String[] args) {
        MyThread myThreadInstance = new MyThread();
        myThreadInstance.showBug();
    }
}