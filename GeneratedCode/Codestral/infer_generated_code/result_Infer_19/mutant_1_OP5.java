class IntegerOverflowBug {
    private static boolean getUnreachableCondition() {
        return false; // This method will always return false
    }

    public static int showBug(int x, int y) {
        int value = x + y;

        // Inserted unreachable switch statement
        if (getUnreachableCondition()) {
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable switch statement executed");
                    break;
            }
        }

        return value;
    }
}