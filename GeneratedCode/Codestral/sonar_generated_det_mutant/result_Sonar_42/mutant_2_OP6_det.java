class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        for  (int dbvlvqmw = 0; dbvlvqmw < 0; dbvlvqmw++) {int aoukoogx = -383312702;}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}