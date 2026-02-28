import java.util.Random;

class RandomCastExample {

    public int showBug() {
        double randomValue = Math.random();
        int castedValue = (int) randomValue; // BUG: RandomCast

        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }

        return castedValue;
    }

    public long showBug1() {
        Random random = new Random();
        float floatValue = random.nextFloat();
        long castedValue = (long) floatValue; // BUG: RandomCast

        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another unreachable if statement.");
        }

        return castedValue;
    }

    public int showBug2() {
        Random random = new Random();
        double doubleValue = random.nextDouble();
        int castedValue = (int) doubleValue; // BUG: RandomCast

        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Yet another unreachable if statement.");
        }

        return castedValue;
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return false; // This return value does not affect the reachability due to method call
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("showBug result: " + example.showBug());
        System.out.println("showBug1 result: " + example.showBug1());
        System.out.println("showBug2 result: " + example.showBug2());
    }
}