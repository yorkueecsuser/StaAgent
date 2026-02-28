import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Mutation: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Mutation: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Mutation: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return intValue;
    }

    private boolean getCondition() {
        return false; // This simulates a condition that is always false at runtime
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}