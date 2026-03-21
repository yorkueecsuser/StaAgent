import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            if (true && true && true && true && true && false && false && true && false && false && false) {long sqjmjljb = 562907888;}else{boolean jqpjncvp = true;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}