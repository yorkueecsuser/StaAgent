class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        if (true && false && true && true && true && true && false && true && true && false && false) {boolean mcaxgavx = false;}else{long zqxnkslw = -870444513;}
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
        }
        return counter;
    
}

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}