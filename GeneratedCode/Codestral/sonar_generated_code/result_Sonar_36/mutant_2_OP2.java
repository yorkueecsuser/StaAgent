import org.mockito.Mock;

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    // A mock object 'bar' is declared but not initialized, which will lead to a NullPointerException when used.
    @Mock
    private Bar bar;

    private Bar barDuplicate; // Added duplicate declaration

    public void showBug() {
        barDuplicate = bar; // Added duplicate assignment

        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}