class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        return unboxedResult;
    }

    // Mutant code starts here
    public Integer showBugMutant(boolean f) {
        Integer a = 10;
        Integer r = f ? a : null; // BUG: NullTernary
        int u = r; // This line will throw NullPointerException if r is null
        return u;
    }
    // Mutant code ends here

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }

        // Testing the mutant method
        try {
            System.out.println("Mutant Result: " + example.showBugMutant(false)); // This will demonstrate the bug in mutant
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null in mutant.");
        }
    }
}