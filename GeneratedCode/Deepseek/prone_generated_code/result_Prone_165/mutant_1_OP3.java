class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        // Mutant Code
        boolean condition = false;  // Altered condition to make it unreachable
        if (condition) {
            System.out.println("This code is unreachable");
        }
    }
}