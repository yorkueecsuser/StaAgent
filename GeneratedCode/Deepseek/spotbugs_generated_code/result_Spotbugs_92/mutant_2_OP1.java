import java.util.Random;

class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        int deadStoreVariable = generateRandomInt(); // Mutated code: Adding a dead store variable
        return value == value; // Original code: Self comparison of value with itself
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}