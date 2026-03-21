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
        boolean cfvcfjvc = false;while (cfvcfjvc && true && true && false && true && false && true && true && true && true && true && false) {String dqaavvih = "enqaudnq";}
        incrementCounter();
        decrementCounter();
        return sharedCounter;
    
}

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        System.out.println("Final value of sharedCounter: " + example.showBug());
    }
}