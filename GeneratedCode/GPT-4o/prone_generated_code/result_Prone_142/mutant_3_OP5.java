import java.util.Random;

class RandomCastExample {

    public int showBugWithMathRandom() {
        double randomValue = Math.random();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Introduce an unreachable switch statement as mutant
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 1:
                // This code will never be executed because unreachableSwitchVariable will never be 1
                intValue = 100;
                break;
            default:
                // Default case to ensure switch is well-formed
                break;
        }

        return intValue;
    }

    public int showBugWithRandomClass() {
        Random random = new Random();
        double randomValue = random.nextDouble();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Introduce an unreachable switch statement as mutant
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 2:
                // This code will never be executed because unreachableSwitchVariable will never be 2
                intValue = 200;
                break;
            default:
                // Default case to ensure switch is well-formed
                break;
        }

        return intValue;
    }

    public int showBugWithRandomClassFloat() {
        Random random = new Random();
        float randomValue = random.nextFloat();
        int intValue = (int) randomValue; // BUG: RandomCast

        // Introduce an unreachable switch statement as mutant
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 3:
                // This code will never be executed because unreachableSwitchVariable will never be 3
                intValue = 300;
                break;
            default:
                // Default case to ensure switch is well-formed
                break;
        }

        return intValue;
    }

    private int getUnreachableSwitchVariable() {
        // Always returns a value that does not match any switch case
        return 0;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("Result using Math.random(): " + example.showBugWithMathRandom());
        System.out.println("Result using Random.nextDouble(): " + example.showBugWithRandomClass());
        System.out.println("Result using Random.nextFloat(): " + example.showBugWithRandomClassFloat());
    }
}