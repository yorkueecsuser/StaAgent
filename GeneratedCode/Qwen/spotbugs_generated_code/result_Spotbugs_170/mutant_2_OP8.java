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
        assert value == incrementCounter(); // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD) 
        int b = counter; // Added line with renamed variable
        return b; // Using the renamed variable
    }

    public static void main(String[] args) {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        System.out.println("Counter after assertion: " + example.showBug());
        int a = 10; // Added line with renamed variable
        System.out.println("Additional variable: " + a); // Using the renamed variable
    }
}