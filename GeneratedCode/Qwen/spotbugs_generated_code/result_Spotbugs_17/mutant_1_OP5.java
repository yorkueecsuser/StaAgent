class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        boolean condition = getCondition();
        switch (condition) { // Unreachable switch statement
            case true:
                System.out.println("This is an unreachable switch case.");
                break;
        }
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    private boolean getCondition() {
        return false; // This method ensures the switch statement is unreachable
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