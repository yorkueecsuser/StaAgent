class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}