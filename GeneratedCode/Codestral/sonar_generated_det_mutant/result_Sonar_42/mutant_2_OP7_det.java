class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        boolean hznficko = false;while (hznficko && true && false && false && true && true && true && false && true && true && true && false) {int dobkncrj = -245573974;}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}