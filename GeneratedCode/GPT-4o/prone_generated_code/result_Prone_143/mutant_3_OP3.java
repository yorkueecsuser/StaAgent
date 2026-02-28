import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger
        // Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This emulates an always false condition without using compile-time constants directly
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}