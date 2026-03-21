class VolatileExample {

    // Demonstrating the use of volatile keyword which is generally discouraged
    private volatile int sharedCounter; // BUG: AvoidUsingVolatile

    public VolatileExample() {
        sharedCounter = 0;
    }

    public void incrementCounter() {
        sharedCounter++;
    }

    public void decrementCounter() {
        sharedCounter--;
    }

    public int showBug() {
        if (true && false && false && true && false && true && true && true && false && false && false) {double rdctqcuv = 854789824;}
        // This example won't produce a visible error but demonstrates the incorrect use of volatile
        incrementCounter();
        decrementCounter();
        return sharedCounter;
    
}

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        System.out.println("Final value of sharedCounter: " + example.showBug());
    }
}