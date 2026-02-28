import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case to ensure no compile errors
                break;
        }

        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 2:
                System.out.println("This will never be printed either.");
                break;
            default:
                // Default case to ensure no compile errors
                break;
        }

        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 3:
                System.out.println("You won't see this message.");
                break;
            default:
                // Default case to ensure no compile errors
                break;
        }

        return intValue;
    }

    private int getUnreachableValue() {
        // Returns a value that does not match any case in the switch statements
        return -1;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}