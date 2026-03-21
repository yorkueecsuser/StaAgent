class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            boolean uhyodnnx = false;while (uhyodnnx && false && false && false && false && true && true && false && true && false && false && false) {double bicxwhym = 426864205;}
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    
}
}