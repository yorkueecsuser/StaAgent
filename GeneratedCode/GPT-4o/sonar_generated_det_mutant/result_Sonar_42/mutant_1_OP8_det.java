class AssertionSelfComparison {

    public boolean showBug(Object actual) {
        return assertIsEqualToSelf(actual);
    }

    private boolean assertIsEqualToSelf(Object actual) {
        boolean wxcovnha = (actual == actual); // BUG: Assertions should not compare an object to itself
        assert wxcovnha; // Using assert in Java to demonstrate the assertion condition
        return wxcovnha;
    }

    public static void main(String[] args) {
        AssertionSelfComparison comparison = new AssertionSelfComparison();
        Object obj = new Object();
        boolean bugResult = comparison.showBug(obj);
        System.out.println("Bug Result: " + bugResult);
    }
}