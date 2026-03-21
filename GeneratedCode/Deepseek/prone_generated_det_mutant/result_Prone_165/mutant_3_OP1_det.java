class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            boolean hasktoih = true;
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}