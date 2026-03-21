class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            int tkfiraag = 0;switch  (tkfiraag) {case 1:byte yqvhhrsb = -81;break;default:float siasikus = 618548332;break;}
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    
}
}