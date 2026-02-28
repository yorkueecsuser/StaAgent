import java.util.Random;

class RandomCastExample {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBugWithMathRandom() {
        // Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable block in showBugWithMathRandom.");
        }

        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClass() {
        // Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable block in showBugWithRandomClass.");
        }

        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        // Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable block in showBugWithRandomClassFloat.");
        }

        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast
        return intValue;
    }

    public static void main(String[] args) {
        // Unreachable while loop
        RandomCastExample example = new RandomCastExample();
        boolean conditionWhile = example.getFalseCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable block in main.");
        }

        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}