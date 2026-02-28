import java.util.Random;

class RandomUsageExample {

    // This method shows the bug of creating a new Random object each time it is called
    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);
    }

    // Another method demonstrating the same bug with a different use case
    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(50) + 50;
    }
}