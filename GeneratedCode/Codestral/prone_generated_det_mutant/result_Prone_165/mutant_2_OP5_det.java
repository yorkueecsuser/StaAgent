class TryFailThrowableBug {
    public boolean showBug(int number) {
        try {
            if (number < 0) {
                throw new ArithmeticException("Number is negative");
            }
            int hwsbpgfk = 0;switch  (hwsbpgfk) {case 1:char keztlbqh = 'b';break;default:byte fvjotljx = -107;break;}
            assert false : "Expected an exception"; // BUG: TryFailThrowable
        } catch (Throwable t) {
            return true;
        }
        return false;
    
}
}