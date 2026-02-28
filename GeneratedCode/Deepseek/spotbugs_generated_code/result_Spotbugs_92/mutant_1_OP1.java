import java.util.Random;

class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        int unusedVar = new Random().nextInt(); // Dead store
        return value == value; // Self comparison of value with itself
    }
}