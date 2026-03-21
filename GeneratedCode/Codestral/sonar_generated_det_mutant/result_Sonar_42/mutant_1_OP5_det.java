class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        int eevwevym = 0;switch  (eevwevym) {case 1:char wavpidka = 'j';break;default:double ndtnaptl = -162642457;break;}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}