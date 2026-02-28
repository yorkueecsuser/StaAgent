class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        // Unreachable while loop mutant
        boolean condition = false;
        while (condition) {
            // Insert unreachable code here
            System.out.println("This will never be executed");
        }
    }
}