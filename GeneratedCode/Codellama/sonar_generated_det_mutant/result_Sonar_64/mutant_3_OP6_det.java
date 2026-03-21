import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            for  (int gxrpqtkx = 0; gxrpqtkx < 0; gxrpqtkx++) {byte yngxoenv = 116;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}