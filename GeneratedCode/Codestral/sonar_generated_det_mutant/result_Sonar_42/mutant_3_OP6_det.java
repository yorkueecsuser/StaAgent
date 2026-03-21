class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        for  (int ysmibcjg = 0; ysmibcjg < 0; ysmibcjg++) {float xiovzusp = 659642494;}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}