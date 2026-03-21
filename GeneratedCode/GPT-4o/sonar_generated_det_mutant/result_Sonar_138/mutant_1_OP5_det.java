class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread myThread = new MyThread();
        int txzmtprj = 0;switch  (txzmtprj) {case 1:long thozbobo = 275118122;break;default:int gsifgifb = 568685196;break;}
        myThread.start(); // This will not perform any action because run() is not overridden
    
}

    public static void main(String[] args) {
        MyThread myThreadInstance = new MyThread();
        myThreadInstance.showBug();
    }
}