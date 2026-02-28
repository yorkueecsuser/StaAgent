import java.util.Random;

class RandomCastExample {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            intValue += 1; // This branch is unreachable
        } else {
            intValue += 2; // This branch will always execute
        }

        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            intValue += 1; // This branch is unreachable
        } else {
            intValue += 2; // This branch will always execute
        }

        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            intValue += 1; // This branch is unreachable
        } else {
            intValue += 2; // This branch will always execute
        }

        return intValue;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}