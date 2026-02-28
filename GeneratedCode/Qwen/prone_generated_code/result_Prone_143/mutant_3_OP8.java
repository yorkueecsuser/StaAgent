import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    }

    public int showBug(int m) {
        Random r = new Random();
        int x = r.nextInt() % m; // Mutated variable names
        return x;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        System.out.println("Result of showBug with n=5: " + example.showBug(5));
        System.out.println("Result of mutated showBug with m=5: " + example.showBug(5)); // Call to mutated method
    }
}