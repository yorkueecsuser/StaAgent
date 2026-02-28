class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    // A mock object 'bar' is declared but not initialized, which will lead to a NullPointerException when used.
    //private Bar bar; // Commented out to remove compilation error

    public void showBug() {
        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error

        // Mutation Operator: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable, added for the mutation
            throw new IllegalStateException("Unreachable block executed");
        } else {
            throw new NullPointerException("Bar is not initialized");
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}