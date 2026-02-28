import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        
        // Introduce a variable to control the unreachable loop
        boolean forLoopCondition = getForLoopCondition();
        
        // Unreachable for loop with a dynamically determined condition
        for (int i = 0; forLoopCondition; i++) {
            // This code block is unreachable
            System.out.println("This loop is unreachable.");
        }
        
        return result;
    }
    
    // Method to provide a runtime condition for the for loop
    private boolean getForLoopCondition() {
        return false; // This ensures the loop is unreachable
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}