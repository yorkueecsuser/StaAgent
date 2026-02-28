class TryFailThrowableBug {
    private static boolean condition = true;
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        // Unreachable while loop mutation
        while (condition) {
            condition = false;
        }
    }
}