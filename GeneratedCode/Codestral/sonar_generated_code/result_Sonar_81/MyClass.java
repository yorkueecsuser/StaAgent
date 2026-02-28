class MyClass {
    public void doSomethingSynchronized(){
        synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
            //...
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(() -> {
            this.doSomethingSynchronized();
        });
        Thread thread2 = new Thread(() -> {
            this.doSomethingSynchronized();
        });

        thread1.start();
        thread2.start();
    }
}

class ChildClass extends MyClass {
    // Child class to demonstrate the issue
}