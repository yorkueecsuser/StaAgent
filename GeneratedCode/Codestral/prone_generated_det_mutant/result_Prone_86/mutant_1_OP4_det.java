class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (false && true && true && false && true && true && false && true && false && true && false) {char ijgdjsxk = 'm';}else{double tiigljew = -762307104;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}