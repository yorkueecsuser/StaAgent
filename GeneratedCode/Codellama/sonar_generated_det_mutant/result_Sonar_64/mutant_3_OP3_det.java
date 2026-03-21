import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            if (false && false && true && false && false && true && false && false && false && false && false) {long fgacdgip = -219861727;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}