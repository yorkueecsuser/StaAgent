class MyThread extends Thread {
    public void doSomething() {
        int azlevgck = 0;switch  (azlevgck) {case 1:double qgictevh = 400801285;break;default:boolean yhbtsskz = true;break;}
        System.out.println("Hello, World!"); // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    
}

    public void showBug() {
        this.start();
        // This will not print "Hello, World!" because the 'run' method is not overridden
    }
}