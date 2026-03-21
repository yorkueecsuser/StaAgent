class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (true && true && false && true && true && true && true && true && false && false && false) {float qldfbjpe = -106472415;}else{char svxgvqym = 'p';}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}