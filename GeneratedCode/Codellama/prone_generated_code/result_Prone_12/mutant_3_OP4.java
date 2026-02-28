class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Mutant 1: Unreachable if-else statement
        if (false) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }

        // Mutant 2: Unreachable if-else statement
        int condition = getCondition();
        if (condition) {
            System.out.println("This branch is reachable");
        } else {
            System.out.println("This branch is unreachable");
        }

        // Mutant 3: Unreachable for loop
        int condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This loop is reachable");
        }

        // Mutant 4: Unreachable while loop
        int condition = getCondition();
        while (condition) {
            System.out.println("This loop is reachable");
        }

        // Mutant 5: Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This branch is reachable");
                break;
            case 2:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This branch is unreachable");
        }
    }

    // Helper method to get a non-final variable for the if-else statement
    private static boolean getCondition() {
        return true;
    }

    // Helper method to get a non-final variable for the for loop
    private static boolean getConditionFor() {
        return true;
    }

    // Helper method to get a non-final variable for the while loop
    private static boolean getConditionWhile() {
        return true;
    }

    // Helper method to get a non-final variable for the switch statement
    private static int getValue() {
        return 1;
    }
}