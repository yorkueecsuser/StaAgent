class AssertionSideEffectExample {

    // Method that produces a side effect
    private int incrementCounter() {
        counter++;
        return counter;
    }

    private int counter = 0;

    // Method to demonstrate the bug
    public int showBug() {
        int value = 5;
        
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            counter += 10;
        } else {
            // This block will also never execute
            counter -= 5;
        }

        assert value == incrementCounter(); // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD) 
        return counter;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the condition is always false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        System.out.println("Counter after assertion: " + example.showBug());
    }
}