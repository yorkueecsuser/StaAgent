class ForLoopBug {
    private static boolean getCondition() {
        return false; // Always returns false to make the if-else statement unreachable
    }

    public int[] showBug() {
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;

            // Mutant: Unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This code will never be executed
                System.out.println("This is an unreachable statement.");
            } else {
                // This code will also never be executed
                System.out.println("This is another unreachable statement.");
            }
        }
        return arr;
    }
}