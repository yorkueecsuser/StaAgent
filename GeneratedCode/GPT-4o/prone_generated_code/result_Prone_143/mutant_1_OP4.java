import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        
        // Unreachable if-else statement introduction
        boolean shouldExecute = getCondition(); // This method should return false
        if (shouldExecute) {
            System.out.println("This branch is unreachable."); // Unreachable code
        } else {
            System.out.println("This branch is always executed.");
        }
        
        return result;
    }
    
    private boolean getCondition() {
        return false; // Returning false to make the if-branch unreachable
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}