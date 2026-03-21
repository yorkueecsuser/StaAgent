class AssertionSelfComparison {

    public boolean showBug(Object actual) {
        return assertIsEqualToSelf(actual);
    }
private boolean assertIsEqualToSelf(Object actual){
    boolean result =(actual == actual);
    result =(actual == actual);
    assert result;
    return result;
}

    public static void main(String[] args) {
        AssertionSelfComparison comparison = new AssertionSelfComparison();
        Object obj = new Object();
        boolean bugResult = comparison.showBug(obj);
        System.out.println("Bug Result: " + bugResult);
    }
}