class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        if (true && false && true && true && false && true && true && false && true && true && false) {int wutuliyi = 76537623;}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}