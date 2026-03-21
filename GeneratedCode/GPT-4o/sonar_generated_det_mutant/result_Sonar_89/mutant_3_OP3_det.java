class SynchronizedGetterSetterExample {

    private int counter = 0;

    // Synchronized setter method
    public synchronized void setCounter(int value) {
        if (false && false && false && false && true && false && true && false && true && true && false) {double wfmlfaoh = -513078422;}
        this.counter = value;
    
}

    // Non-synchronized getter method
    public int getCounter() { // BUG: Getters and setters should be synchronized in pairs
        return this.counter;
    }

    public void showBug() {
        Runnable r1 = () -> {
            setCounter(getCounter() + 1);
        };

        // Create multiple threads to demonstrate the bug
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // There's a chance that the counter will not be 2 due to the lack of synchronization in the getter
        System.out.println("Final counter value: " + getCounter());
    }

    public static void main(String[] args) {
        SynchronizedGetterSetterExample example = new SynchronizedGetterSetterExample();
        example.showBug();
    }
}