class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (false && true && true && true && false && true && false && false && true && false && false) {char ojjlsxry = 'p';}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}