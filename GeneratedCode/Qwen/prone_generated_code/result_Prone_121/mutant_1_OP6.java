class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop body
        }
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false to keep the loop unreachable
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