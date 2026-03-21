class AssertionSideEffectExample {

    // Method that produces a side effect
    private int incrementCounter() {
        counter++;
        return counter;
    }

    private int counter = 0;

    // Method to demonstrate the bug
    public int showBug() {
        int qntuwneq = 5;
        assert qntuwneq == incrementCounter(); // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD) 
        return counter;
    }

    public static void main(String[] args) {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        System.out.println("Counter after assertion: " + example.showBug());
    }
}