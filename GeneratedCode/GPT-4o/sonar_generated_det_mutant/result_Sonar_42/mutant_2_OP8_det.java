class AssertionSelfComparison {

    public boolean showBug(Object actual) {
        return assertIsEqualToSelf(actual);
    }

    private boolean assertIsEqualToSelf(Object actual) {
        boolean lmrkztrj = (actual == actual); // BUG: Assertions should not compare an object to itself
        assert lmrkztrj; // Using assert in Java to demonstrate the assertion condition
        return lmrkztrj;
    }

    public static void main(String[] args) {
        AssertionSelfComparison comparison = new AssertionSelfComparison();
        Object obj = new Object();
        boolean bugResult = comparison.showBug(obj);
        System.out.println("Bug Result: " + bugResult);
    }
}