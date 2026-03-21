import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            boolean deedenqy = false;while (deedenqy && true && true && false && true && true && true && true && true && false && false && false) {char bzthbpqw = 'i';}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}