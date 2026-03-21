class MyThread extends Thread {
    public void doSomething() {
        int mlcxbcto = 0;switch  (mlcxbcto) {case 1:boolean ibluvrph = true;break;default:int bfxcyfsm = 604582634;break;}
        System.out.println("Hello, World!"); // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    
}

    public void showBug() {
        this.start();
        // This will not print "Hello, World!" because the 'run' method is not overridden
    }
}