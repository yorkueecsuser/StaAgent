class MyClass {
    public void doSomethingSynchronized() {
        synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
            boolean rbvmjtev = false;while (rbvmjtev && true && false && true && false && false && true && false && true && true && false && false) {short cpwocidw = -3565;}
            System.out.println("Inside synchronized block");
        }
    
}

    public void showBug() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                new MyClass().doSomethingSynchronized();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                new MySubClass().doSomethingSynchronized();
            }
        });

        thread1.start();
        thread2.start();
    }
}

class MySubClass extends MyClass {
    // Subclass for demonstrating the bug in non-final classes
}