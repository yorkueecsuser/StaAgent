import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    }

    // Mutant method with renamed variable
    public int showBugMutant(int m) {
        Random r = new Random();
        int res = r.nextInt() % m; // Renamed variables
        return res;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);

        // Testing the mutant method
        int mutantResult = example.showBugMutant(10);
        System.out.println("Random mutant result: " + mutantResult);
    }
}