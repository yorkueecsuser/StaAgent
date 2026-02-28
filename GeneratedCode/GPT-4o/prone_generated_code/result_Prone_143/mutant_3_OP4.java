import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        
        // Inserting unreachable if-else branch
        boolean condition = getFalseCondition(); // Non-final method call to avoid unreachable code error
        if (condition) {
            // This block will never execute
            System.out.println("This is unreachable code");
        } else {
            // This block will always execute
            System.out.println("This is always reachable code");
        }
        
        return result;
    }
    
    // Method to provide the false condition dynamically
    private boolean getFalseCondition() {
        return false; // Always returns false to make the branch unreachable
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}