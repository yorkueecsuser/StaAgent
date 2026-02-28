class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Mutant code starts here
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() returns false
            System.out.println("This is an unreachable if block");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is an unreachable else block");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}