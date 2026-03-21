import java.util.Random;

class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        Random rand = new Random(); // Dead Store: added a new Random object that is never used
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;
        }
        return sum;
    }
}