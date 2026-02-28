import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        
        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never be executed
            System.out.println("This is an unreachable while loop.");
        }
        
        return result;
    }

    private boolean getCondition() {
        return false; // The condition is always false
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}