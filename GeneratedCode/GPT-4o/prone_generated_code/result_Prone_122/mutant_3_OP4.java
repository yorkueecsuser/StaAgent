class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null

        // Inserting unreachable if-else branch
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("The unreachable block was skipped.");
        }

        return unboxedResult;
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getFalseCondition() {
        return false;
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