class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        for  (int cghdbrpd = 0; cghdbrpd < 0; cghdbrpd++) {String nupldbsw = "qnenovjc";}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}