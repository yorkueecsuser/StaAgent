class JumbledIncrementer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // BUG: JumbledIncrementer
        }
        System.out.println(sum);

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case false:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
        }

        // If statement with compile-time constant
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }

        // While loop with false condition
        while (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }

        // For loop with false condition
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }

        // If-else statement with compile-time constant
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Reachable code
            System.out.println("This code is reachable");
        }

        // Switch statement with compile-time constant
        switch (0) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
        }
    }

    // Method to determine condition dynamically
    public static boolean getCondition() {
        // Dynamic condition
        return Math.random() > 0.5;
    }

    // Method to get a value for the switch expression
    public static int getValue() {
        // Dynamic value
        return (int) (Math.random() * 10);
    }
}