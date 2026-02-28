import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Adding an unreachable if-else statement
        boolean condition = getCondition(); // Non-final variable to prevent unreachable code error
        if (condition) {
            // This will never execute
            intValue = 42;
        } else {
            // Original code remains unaffected
        }

        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Adding an unreachable if-else statement
        boolean condition = getCondition(); // Non-final variable to prevent unreachable code error
        if (condition) {
            // This will never execute
            intValue = 42;
        } else {
            // Original code remains unaffected
        }

        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Adding an unreachable if-else statement
        boolean condition = getCondition(); // Non-final variable to prevent unreachable code error
        if (condition) {
            // This will never execute
            intValue = 42;
        } else {
            // Original code remains unaffected
        }

        return intValue;
    }

    // This method always returns false, fulfilling the condition for the unreachable code
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}