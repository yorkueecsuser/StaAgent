import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape

        // Unreachable if-else statement mutation
        boolean randomCondition = getRandomCondition();
        if (randomCondition) {
            System.out.println("Unreachable code executed");
        } else {
            System.out.println("Unreachable code not executed");
        }
    }

    private static boolean getRandomCondition() {
        // Implementation of a method that returns a random boolean value
        Random random = new Random();
        return random.nextBoolean();
    }
}