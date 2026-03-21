class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (false && true && true && false && true && false && false && false && false && true && false) {char jdmvqpza = 'n';}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}