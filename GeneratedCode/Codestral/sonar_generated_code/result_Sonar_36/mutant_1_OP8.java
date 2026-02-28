import java.lang.NullPointerException; // Import statement to ensure compilation

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    private Bar bar; // Commented out to remove compilation error
    private Bar baz; // Newly added field for mutation

    public void showBug() {
        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    public void showMutant() {
        // Mutant code: Attempt to use the newly added uninitialized field 'baz'
        baz.someMethod();
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
        example.showMutant(); // Call to the mutant method
    }
}