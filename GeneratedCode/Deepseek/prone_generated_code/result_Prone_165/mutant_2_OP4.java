class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        // Mutated code block
        boolean isUnreachable = false;
        if (isUnreachable) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This is reachable code.");
        }
    }
}