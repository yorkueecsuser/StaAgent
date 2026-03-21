class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            if (false && false && false && true && false && true && true && false && false && false && false) {boolean weoovizx = true;}else{long cbwityqa = 589207167;}
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    
}
}