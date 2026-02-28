class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }

        // Mutation Operator: Unreachable while loop
        // The condition of the inserted loop is always false to make it unreachable.
        boolean condition = getCondition();
        while (condition) {
            // This code will never be reached so it will not cause a unreachable statement error.
        }
    }

    // A method to return a constant value of false.
    public static boolean getCondition() {
        return false;
    }
}