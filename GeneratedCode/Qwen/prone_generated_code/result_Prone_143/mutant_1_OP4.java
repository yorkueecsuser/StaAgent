import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger

        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            result = result * 2;
        } else {
            // This block also should never execute
            result = result / 2;
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        System.out.println("Result of showBug with n=5: " + example.showBug(5));
    }
}