// This is a minimal implementation with no external libraries to showcase the bug.

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    // A mock object 'bar' is declared but not initialized, which will lead to a NullPointerException when used.
    // private Bar bar; // Commented out to remove compilation error

    public void showBug() {
        // Introducing an unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This code will never be executed
                break;
        }

        // Calling a method on an uninitialized mock will throw a NullPointerException
        // bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    private int getUnreachableValue() {
        // This method always returns a value outside the range of the switch cases
        return -1;
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}