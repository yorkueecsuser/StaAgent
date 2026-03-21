class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (false && false && false && true && true && true && false && true && true && false && false) {short vbzldodn = -8119;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}