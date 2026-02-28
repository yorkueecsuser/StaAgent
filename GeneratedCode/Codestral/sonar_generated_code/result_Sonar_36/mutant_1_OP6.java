// This is a minimal implementation with no external libraries to showcase the bug.
// Please note that the `Bar` class is commented out as it doesn't exist.

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    // A mock object 'bar' is declared but not initialized, which will lead to a NullPointerException when used.
    //private Bar bar; // Commented out to remove compilation error

    public void showBug() {
        boolean conditionFor = getCondition(); // New method call to dynamically determine the condition
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            // The loop is inserted to implement the mutation operator "Unreachable for loop"
        }

        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    private boolean getCondition() {
        return false; // The method always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}