import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            for  (int tflgfmyc = 0; tflgfmyc < 0; tflgfmyc++) {byte gbsuqgpv = 31;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}