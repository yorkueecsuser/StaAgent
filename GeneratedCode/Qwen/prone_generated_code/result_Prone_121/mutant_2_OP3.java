class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if statement unreachable
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