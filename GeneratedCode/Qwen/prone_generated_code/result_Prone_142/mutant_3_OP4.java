import java.util.Random;

class RandomCastExample {

    public int showBug() {
        double randomValue = Math.random();
        int castedValue = (int) randomValue; // BUG: RandomCast

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            castedValue = 42;
        } else {
            // This block will always execute
            castedValue = -42;
        }

        return castedValue;
    }

    public long showBug1() {
        Random random = new Random();
        float floatValue = random.nextFloat();
        long castedValue = (long) floatValue; // BUG: RandomCast

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            castedValue = 100L;
        } else {
            // This block will always execute
            castedValue = -100L;
        }

        return castedValue;
    }

    public int showBug2() {
        Random random = new Random();
        double doubleValue = random.nextDouble();
        int castedValue = (int) doubleValue; // BUG: RandomCast

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            castedValue = 99;
        } else {
            // This block will always execute
            castedValue = -99;
        }

        return castedValue;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-else branch is unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("showBug result: " + example.showBug());
        System.out.println("showBug1 result: " + example.showBug1());
        System.out.println("showBug2 result: " + example.showBug2());
    }
}