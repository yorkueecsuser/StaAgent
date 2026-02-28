class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null

        // Mutation: Unreachable For Loop
        boolean unreachableCondition = getCondition(); // Dynamically determine condition at runtime
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This code is unreachable because the condition is false.");
        }

        return unboxedResult;
    }

    private boolean getCondition() {
        return false; // Method returns false, making the loop condition false
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