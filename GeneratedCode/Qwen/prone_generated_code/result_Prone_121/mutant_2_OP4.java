class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code block
            System.out.println("This is an unreachable if block.");
        } else {
            // Unreachable code block
            System.out.println("This is an unreachable else block.");
        }
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    }

    private boolean getCondition() {
        // This method returns false, making the if-else block unreachable
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