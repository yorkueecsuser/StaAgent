class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        // Mutated code: Unreachable if statement
        if (false) {
            System.out.println("This statement is unreachable.");
        }
    }
}