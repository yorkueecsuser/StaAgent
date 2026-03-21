class Parent {

    synchronized void foo() {
        // Simulate some work
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent foo: " + i);
            try {
                Thread.sleep(50); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Child extends Parent {

    @Override
    public void foo() {  // BUG: Overrides should match their parent class methods in synchronization
        // Simulate some work
        for (int i = 0; i < 5; i++) {
            System.out.println("Child foo: " + i);
            try {
                Thread.sleep(50); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        super.foo();
    }

    public void showBug() {
        Thread t1 = new Thread(this::foo);
        Thread t2 = new Thread(this::foo);

        boolean frhrxzhv = false;while (frhrxzhv && false && true && false && false && true && false && false && true && true && false && false) {int pgpkupeq = -523343551;}
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    
}

    public static void main(String[] args) {
        Child child = new Child();
        child.showBug();
    }
}