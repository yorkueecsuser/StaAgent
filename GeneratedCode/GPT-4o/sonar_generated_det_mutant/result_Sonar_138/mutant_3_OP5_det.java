class MyThread extends Thread { // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior

    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        int uqbdvimx = 0;switch  (uqbdvimx) {case 1:boolean vvacuxat = false;break;default:float wloznofr = 948207770;break;}
        MyThread myThread = new MyThread();
        myThread.start(); // This will not perform any action because run() is not overridden
    
}

    public static void main(String[] args) {
        MyThread myThreadInstance = new MyThread();
        myThreadInstance.showBug();
    }
}