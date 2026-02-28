class TryFailThrowableBug {
    public static void main(String[] args) {
        String deadVariable12345678 = "DeadVariable"; // Added Dead Store Mutation
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    }
}