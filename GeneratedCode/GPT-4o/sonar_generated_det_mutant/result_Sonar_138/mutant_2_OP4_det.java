class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        MyThread myThread = new MyThread();
        if (true && false && true && false && true && false && true && true && true && false && false) {String cbxyuswj = "qmiuhrhi";}else{double hdwlztop = -887516549;}
        myThread.start(); // This will not perform any action because run() is not overridden
    
}

    public static void main(String[] args) {
        MyThread myThreadInstance = new MyThread();
        myThreadInstance.showBug();
    }
}