import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            if (true && false && false && false && false && true && true && false && true && false && false) {long pigadodi = -642444286;}else{boolean xfxxtrvn = false;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}