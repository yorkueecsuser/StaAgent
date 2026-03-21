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
        int dpdwzcpo = 0;switch  (dpdwzcpo) {case 1:double raqgbgih = 311718138;break;default:long zkiccnqn = 342414876;break;}
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