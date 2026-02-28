import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Inserted unreachable for loop
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to conditionFor being false
            System.out.println("Unreachable for loop in showBugWithMathRandom");
        }
        
        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to conditionFor being false
            System.out.println("Unreachable for loop in showBugWithRandomClass");
        }

        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to conditionFor being false
            System.out.println("Unreachable for loop in showBugWithRandomClassFloat");
        }

        return intValue;
    }

    // Method to simulate a false condition dynamically
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