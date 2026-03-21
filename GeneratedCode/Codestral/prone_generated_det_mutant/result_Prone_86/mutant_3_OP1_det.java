class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
short axatfqkl = 4887;

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}