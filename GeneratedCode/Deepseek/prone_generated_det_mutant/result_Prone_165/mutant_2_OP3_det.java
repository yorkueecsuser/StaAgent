class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            if (true && false && true && false && false && true && false && true && true && false && false) {byte bnpvsvrs = 126;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}