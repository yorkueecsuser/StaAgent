import java.util.Random;

class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        int deadStore;  // added dead store variable
        deadStore = new Random().nextInt(); // assign a random value to the dead store variable
        infiniteRecursion();
    }
}