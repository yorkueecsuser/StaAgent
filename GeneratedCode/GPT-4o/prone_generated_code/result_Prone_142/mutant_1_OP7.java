import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        boolean unreachableConditionWhile = determineCondition();
        while (unreachableConditionWhile) {
            // Unreachable while loop
        }
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        boolean unreachableConditionWhile = determineCondition();
        while (unreachableConditionWhile) {
            // Unreachable while loop
        }
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        boolean unreachableConditionWhile = determineCondition();
        while (unreachableConditionWhile) {
            // Unreachable while loop
        }
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    private boolean determineCondition() {
        // This method returns false, making the condition of the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}