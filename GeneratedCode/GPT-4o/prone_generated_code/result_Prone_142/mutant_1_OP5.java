import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Unreachable switch statement
        int switchValue = getDynamicValue(); // Ensure this is a non-final method call
        switch(switchValue) {
            case 1000: // This case will never be reached
                System.out.println("Unreachable case in showBugWithMathRandom");
                break;
            default:
                // Default case, do nothing
                break;
        }
        
        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Unreachable switch statement
        int switchValue = getDynamicValue(); // Ensure this is a non-final method call
        switch(switchValue) {
            case 2000: // This case will never be reached
                System.out.println("Unreachable case in showBugWithRandomClass");
                break;
            default:
                // Default case, do nothing
                break;
        }
        
        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast
        
        // Unreachable switch statement
        int switchValue = getDynamicValue(); // Ensure this is a non-final method call
        switch(switchValue) {
            case 3000: // This case will never be reached
                System.out.println("Unreachable case in showBugWithRandomClassFloat");
                break;
            default:
                // Default case, do nothing
                break;
        }
        
        return intValue;
    }

    private int getDynamicValue() {
        // Simulating a dynamic value which makes the switch statement unreachable
        return 9999; // This ensures unreachable switch cases
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}