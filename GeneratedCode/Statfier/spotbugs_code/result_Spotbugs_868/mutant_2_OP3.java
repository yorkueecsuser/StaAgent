class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Mutant code starts here
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed");
        }
    }

    private static boolean getUnreachableCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}