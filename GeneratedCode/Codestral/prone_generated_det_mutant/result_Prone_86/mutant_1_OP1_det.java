class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
boolean evtyrvxl = false;

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}