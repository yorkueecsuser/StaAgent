class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Mutant code: Adding an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed");
        }
    }

    // Method to provide a dynamic condition that is always false
    private static boolean getCondition() {
        return false;
    }
}