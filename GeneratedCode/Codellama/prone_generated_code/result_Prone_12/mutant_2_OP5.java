class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }

        // Unreachable if-else statement mutant
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // code
        } else {
            // alternative code
        }

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // code
        }

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // code
        }
    }

    // Method to get the value for the switch statement
    public static int getValue() {
        return 0;
    }

    // Method to get the condition for the if-else statement
    public static boolean getCondition() {
        return false;
    }
}