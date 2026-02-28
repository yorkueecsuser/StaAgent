import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger

        // Introduced unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable because alwaysFalse is never true
                result = -1;
                break;
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        System.out.println("Result of showBug with n=5: " + example.showBug(5));
    }
}