class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
        for(int i = 0; i < 0; i++) {
            // This unreachable loop ensures that the catch block is always reachable
            System.out.println("This loop is unreachable.");
        }
    }
}