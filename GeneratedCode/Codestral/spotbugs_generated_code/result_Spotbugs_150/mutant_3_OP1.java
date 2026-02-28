import java.util.Random;

class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        int deadStore; // New variable declaration
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;
            deadStore = new Random().nextInt(100); // Initialize the dead store variable
        }
        return sum;
    }
}