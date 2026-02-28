class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop");
        }
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
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