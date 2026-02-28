class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Mutant code starts here
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement");
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}