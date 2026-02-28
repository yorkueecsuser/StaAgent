class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // dynamically determined condition
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This line is never executed.");
        }

        return unboxedResult;
    }

    private boolean getCondition() {
        return false; // condition that ensures the while loop is unreachable
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