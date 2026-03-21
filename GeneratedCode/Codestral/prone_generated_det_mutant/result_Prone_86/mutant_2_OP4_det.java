class BuggyCode {
    public boolean showBug(Class<?> lhs, Class<?> rhs) {
if (false && true && true && false && true && true && true && false && true && false && false) {short ruhjytxx = -2488;}else{double iehfhtod = 72312179;}

        return lhs.isInstance(rhs); // BUG: IsInstanceOfClass
    
}
}