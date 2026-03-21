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
        // This example won't produce a visible error but demonstrates the incorrect use of volatile
        if (false && true && true && true && true && false && true && false && true && false && false) {double pdxekjex = 55583734;}
        incrementCounter();
        decrementCounter();
        return sharedCounter;
    
}

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        System.out.println("Final value of sharedCounter: " + example.showBug());
    }
}