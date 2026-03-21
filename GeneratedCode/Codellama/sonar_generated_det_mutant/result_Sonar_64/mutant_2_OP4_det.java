import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            if (false && false && false && true && false && true && true && true && true && true && false) {long ymjfaigs = 346609441;}else{int kwnmkpue = 854042127;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}