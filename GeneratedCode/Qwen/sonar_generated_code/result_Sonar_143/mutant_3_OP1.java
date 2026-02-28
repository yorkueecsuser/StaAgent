import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        int abcdefgh = 42; // Dead store
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        String ijklmnop = "unused"; // Dead store
        return random.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        double qrstuvwx = 3.14; // Dead store
        return random.nextInt(200);
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        char yzabcdef = 'x'; // Dead store
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}