import java.util.Random;

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    //private Bar bar; // Commented out to remove compilation error

    // New Mutant Code: Dead Store
    private int deadStore;

    public void showBug() {
        // Generate a random int to assign to deadStore, to make it not a dead store
        Random rand = new Random();
        deadStore = rand.nextInt(100);

        // Calling a method on an uninitialized mock will throw a NullPointerException
        //bar.someMethod(); // Commented out to remove compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}