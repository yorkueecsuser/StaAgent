import java.util.Random;

class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        int deadStore; // Mutation Operator: Dead Store
        Random rand = new Random();
        deadStore = rand.nextInt(100); // Assigning a random value to deadStore
        infiniteRecursion();
    }
}