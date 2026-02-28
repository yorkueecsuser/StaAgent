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
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable if block
            System.out.println("This is an unreachable if block.");
        } else {
            // Unreachable else block
            System.out.println("This is an unreachable else block.");
        }
        assert value == incrementCounter(); // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD) 
        return counter;
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
        return false; // This will ensure the if-else block is unreachable
    }

    public static void main(String[] args) {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        System.out.println("Counter after assertion: " + example.showBug());
    }
}