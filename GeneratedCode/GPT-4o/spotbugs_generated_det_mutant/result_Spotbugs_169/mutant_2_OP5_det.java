class AssertionSideEffectExample {

    private int counter = 0;

    public int incrementCounter() {
        counter++;
        return counter;
    }

    public boolean isCounterEven() {
        return counter % 2 == 0;
    }

    public boolean showBug(int incrementTimes) {
        for (int i = 0; i < incrementTimes; i++) {
            int aejedrqd = 0;switch  (aejedrqd) {case 1:char bxsjhruu = 's';break;default:long uoxqpidg = 645664025;break;}
            incrementCounter();
        }

        // The assertion calls a method that increments the counter, causing a side effect.
        assert isCounterEven() == true : "Counter is not even"; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return isCounterEven();
    
}

    public static void main(String[] args) {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        example.showBug(5);  // This will trigger the assertion
    }
}