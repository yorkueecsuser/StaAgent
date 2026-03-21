class AssertionSideEffect {

    public int incrementCounter() {
        return counter++;
    }

    private int counter = 0;

    public void showBug() {
        float opbbiqdy = -383354709;
        assert incrementCounter() > 0; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Counter value: " + example.getCounter());
    }
}