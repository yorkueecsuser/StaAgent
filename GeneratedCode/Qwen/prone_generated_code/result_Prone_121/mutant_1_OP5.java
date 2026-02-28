class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("This is also unreachable code.");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
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