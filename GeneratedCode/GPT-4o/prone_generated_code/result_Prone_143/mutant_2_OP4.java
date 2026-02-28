import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        
        // Mutation: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is never reached.");
        } else {
            System.out.println("This else branch is also never reached.");
        }

        return result;
    }

    // A method to ensure the condition is never true
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}