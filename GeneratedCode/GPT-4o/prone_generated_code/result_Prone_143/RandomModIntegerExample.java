import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        
        // Inserted unreachable while loop
        boolean conditionWhile = false; // This is not a compile-time constant
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}