class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            for  (int abxlvqix = 0; abxlvqix < 0; abxlvqix++) {long vluwepmx = -478085655;}
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}