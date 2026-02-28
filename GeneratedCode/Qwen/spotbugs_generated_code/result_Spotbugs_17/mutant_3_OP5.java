class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is an unreachable case.");
                break;
        }
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}