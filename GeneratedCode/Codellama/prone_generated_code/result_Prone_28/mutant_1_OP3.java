import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Mutant 1: Unreachable if statement
        if (getCondition()) {
            System.out.println("This code is unreachable.");
        }

        // Mutant 2: Unreachable while loop
        while (getCondition()) {
            System.out.println("This code is unreachable.");
        }

        // Mutant 3: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This code is unreachable.");
        }

        // Mutant 4: If-else statement with unreachable branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code is reachable.");
        } else {
            System.out.println("This code is unreachable.");
        }

        // Mutant 5: Switch statement with unreachable case
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This code is reachable.");
                break;
            case 0:
                System.out.println("This code is unreachable.");
                break;
            default:
                System.out.println("This code is unreachable.");
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }
}