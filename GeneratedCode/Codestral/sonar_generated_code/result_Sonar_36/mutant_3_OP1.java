import java.util.Random;

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    // A mock object 'bar' is declared but not initialized, which will lead to a NullPointerException when used.
    //private Bar bar; // Commented out to remove compilation error

    // Dead Store Mutant: Adding an unused int variable declaration
    private int deadStoreVariable;

    public void showBug() {
        // Generate a random value for the dead store variable
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100);

        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}