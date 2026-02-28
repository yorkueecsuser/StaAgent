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
        
        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable code
            counter = 0; // This line is unreachable
        }
        
        assert value == incrementCounter(); // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD) 
        return counter;
    }

    // Method to provide a dynamic but always false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        System.out.println("Counter after assertion: " + example.showBug());
    }
}