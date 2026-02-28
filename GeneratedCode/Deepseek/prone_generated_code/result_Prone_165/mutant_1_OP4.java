class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
        if (false) {
            // This if-else statement is intentionally inserted to avoid the unreachable statement error.
            // Original code remains unaltered.
        } else {
            System.out.println("This line is unreachable.");
        }
    }
}