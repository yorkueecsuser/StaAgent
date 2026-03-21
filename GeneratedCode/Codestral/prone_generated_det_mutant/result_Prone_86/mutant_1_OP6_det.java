class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
for  (int whtgeoju = 0; whtgeoju < 0; whtgeoju++) {byte rkibopla = -87;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}