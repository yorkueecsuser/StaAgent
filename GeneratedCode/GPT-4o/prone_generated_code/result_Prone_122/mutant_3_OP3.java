class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        
        // Introducing unreachable if statement based on a runtime condition
        boolean isAlwaysFalse = determineFalseCondition();
        if (isAlwaysFalse) {
            System.out.println("This will never be printed because the condition is always false.");
        }

        return unboxedResult;
    }

    // Method to simulate a runtime-determined false condition
    private boolean determineFalseCondition() {
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