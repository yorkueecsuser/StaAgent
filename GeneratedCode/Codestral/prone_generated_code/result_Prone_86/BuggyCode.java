class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    }
}