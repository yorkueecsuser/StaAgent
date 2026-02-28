class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null

        // Mutation: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition(); // non-final variable used for loop condition
        while (conditionWhile) {
            // Unreachable block
            System.out.println("This is an unreachable while loop.");
        }

        return unboxedResult;
    }

    // Method to provide a condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false; // This makes the while loop conditionally unreachable
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
}