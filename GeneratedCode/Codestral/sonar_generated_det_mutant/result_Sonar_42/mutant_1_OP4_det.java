class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        if (true && false && true && true && false && false && true && false && false && true && false) {double lcttnwlx = 194021375;}else{double wvbaxlgr = 247407292;}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}