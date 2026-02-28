class BitwiseBugExample {
    public static void showBug(int x) {
        int mask = 0x000F;
        int value = x & mask;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            while (false) {
                System.out.println("The value is odd");
            }
        } else {
            System.out.println("The value is even");
        }
    }

    private static boolean getCondition() {
        // this method returns a dynamically determined boolean value at runtime
        return Math.random() > 0.5;
    }
}