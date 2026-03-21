class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        short jfxaract = -4097;
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}