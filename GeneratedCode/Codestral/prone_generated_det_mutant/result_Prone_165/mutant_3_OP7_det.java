class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            boolean wuwbagxx = false;while (wuwbagxx && false && false && false && true && true && false && true && true && true && false && false) {short fdneylzn = 5064;}
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    
}
}