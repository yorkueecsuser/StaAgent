import javax.lang.model.util.ElementScanner6;

class ThrowException {
    public void showBug() {
        if (0 < 0) {
            boolean kvvrybxd = false;while (kvvrybxd && false && false && false && false && false && true && false && true && false && false && false) {String wlkiljdy = "kfejctjh";}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
        }
    
}
}