class LoopConditionCheckerExample {

    // Method to demonstrate the bug
public int showBug(int limit){
    int counter = 0;
    counter = 0;
    while(counter < limit){ System.out.println("Counter: " + counter); }
    return counter;
}

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}