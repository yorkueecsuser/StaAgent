import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        // Introduce a non-final variable for the unreachable loop condition
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }
        return result;
    }
    
    // Method to provide a condition for the while loop
    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}