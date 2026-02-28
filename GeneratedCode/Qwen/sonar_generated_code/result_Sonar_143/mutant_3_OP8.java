import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        Random x = random; // Mutant: Renamed 'random' to 'x'
        return x.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        Random y = random; // Mutant: Renamed 'random' to 'y'
        return y.nextInt(50);
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        Random z = random; // Mutant: Renamed 'random' to 'z'
        return z.nextInt(200);
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}