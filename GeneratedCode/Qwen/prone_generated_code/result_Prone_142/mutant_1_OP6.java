import java.util.Random;

class RandomCastExample {

    public int showBug() {
        double randomValue = Math.random();
        int castedValue = (int) randomValue; // BUG: RandomCast

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }

        return castedValue;
    }

    public long showBug1() {
        Random random = new Random();
        float floatValue = random.nextFloat();
        long castedValue = (long) floatValue; // BUG: RandomCast

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }

        return castedValue;
    }

    public int showBug2() {
        Random random = new Random();
        double doubleValue = random.nextDouble();
        int castedValue = (int) doubleValue; // BUG: RandomCast

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
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
        return false; // This method ensures the condition is dynamically determined but returns false, making the loop unreachable
    }
}