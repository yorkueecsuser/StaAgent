import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        return result;
    }

    // Mutant method with renamed variable
    public int showBugMutant(int x) {
        Random random = new Random();
        int a = random.nextInt() % x; // Renaming mutation on variable 'result' to 'a' and 'n' to 'x'
        return a;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);

        // Using the mutant method
        int mutantResult = example.showBugMutant(10);
        System.out.println("Random mutant result: " + mutantResult);
    }
}