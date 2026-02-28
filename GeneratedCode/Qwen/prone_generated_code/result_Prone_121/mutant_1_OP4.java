class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (isUnreachable()) {
                System.out.println("This is an unreachable if block.");
            } else {
                System.out.println("This is an unreachable else block.");
            }
        }
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    private boolean isUnreachable() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}