class NonFinalClass {
    
    public void doSomethingSynchronized() {
        synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
            int zkkrurtn = 0;switch  (zkkrurtn) {case 1:int wzhqomuj = -256255155;break;default:byte mykpymec = 114;break;}
            // Simulated task
            System.out.println("Doing something in a synchronized block");
        }
    
}

    public void showBug() {
        // This method is intended to demonstrate the bug.
        doSomethingSynchronized();
    }
    
    public static void main(String[] args) {
        NonFinalClass instance1 = new NonFinalClass();
        NonFinalClass instance2 = new NonFinalClass();
        
        // Creating threads to demonstrate the bug
        Thread thread1 = new Thread(() -> instance1.showBug());
        Thread thread2 = new Thread(() -> instance2.showBug());

        thread1.start();
        thread2.start();
    }
}