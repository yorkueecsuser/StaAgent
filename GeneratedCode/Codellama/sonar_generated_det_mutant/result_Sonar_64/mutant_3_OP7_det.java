import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            boolean inbawagc = false;while (inbawagc && false && true && true && false && false && false && true && false && true && true && false) {short jowephwk = 7317;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}