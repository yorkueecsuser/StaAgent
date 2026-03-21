class MyThread extends Thread {
    public void doSomething() {
        int igocdsxp = 0;switch  (igocdsxp) {case 1:double jgndkjji = -977001540;break;default:short hsgyuyaj = 4251;break;}
        System.out.println("Hello, World!"); // BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    
}

    public void showBug() {
        this.start();
        // This will not print "Hello, World!" because the 'run' method is not overridden
    }
}