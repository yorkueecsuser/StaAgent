class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            if (false && true && true && true && true && false && false && false && false && false && false) {float fglzwkgt = 744355615;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}