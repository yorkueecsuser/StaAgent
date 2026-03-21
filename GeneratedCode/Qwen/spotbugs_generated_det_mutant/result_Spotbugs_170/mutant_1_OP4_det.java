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
        if (false && false && true && false && false && true && true && true && false && true && false) {float gsctauch = 496187588;}else{boolean gmiyefpm = true;}
        assert value == incrementCounter(); // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD) 
        return counter;
    
}

    public static void main(String[] args) {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        System.out.println("Counter after assertion: " + example.showBug());
    }
}