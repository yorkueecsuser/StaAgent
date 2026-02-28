import java.util.Random;

class RandomCastExample {

    public int showBug() {
        double randomValue = Math.random();
        int castedValue = (int) randomValue; // BUG: RandomCast

        // Introduced Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            castedValue = 42; // This will never be executed
        } else {
            castedValue = 24; // This will also never be executed
        }

        return castedValue;
    }

    public long showBug1() {
        Random random = new Random();
        float floatValue = random.nextFloat();
        long castedValue = (long) floatValue; // BUG: RandomCast

        // Introduced Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            castedValue = 100L; // This will never be executed
        } else {
            castedValue = 200L; // This will also never be executed
        }

        return castedValue;
    }

    public int showBug2() {
        Random random = new Random();
        double doubleValue = random.nextDouble();
        int castedValue = (int) doubleValue; // BUG: RandomCast

        // Introduced Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            castedValue = 99; // This will never be executed
        } else {
            castedValue = 88; // This will also never be executed
        }

        return castedValue;
    }

    public static void main(String[] args) {
        RandomCastExample example = new RandomCastExample();
        System.out.println("showBug result: " + example.showBug());
        System.out.println("showBug1 result: " + example.showBug1());
        System.out.println("showBug2 result: " + example.showBug2());
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else branches unreachable
    }
}