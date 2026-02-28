import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    }

    // Mutant code
    public int showBugMutant(int a) {
        Random b = new Random();
        int c = b.nextInt() % a; 
        return c;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);

        // Mutant code
        int resultMutant = example.showBugMutant(10);
        System.out.println("Random mutant result: " + resultMutant);
    }
}