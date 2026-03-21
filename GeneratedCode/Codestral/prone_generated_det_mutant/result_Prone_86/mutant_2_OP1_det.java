class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
boolean ugqnfnlv = false;

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}