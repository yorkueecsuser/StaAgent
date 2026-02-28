class BadShiftAmount {
    public static void main(String[] args) {
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);

        // Mutant code starts here
        boolean isReachable = getCondition();
        if (isReachable) {
            switch (getSwitchValue()) {
                case 1:
                    System.out.println("Reached unreachable code block");
                    break;
                default:
                    System.out.println("Default case");
                    break;
            }
        } else {
            System.out.println("Fell through to else block");
        }
        // Mutant code ends here
    }

    // Helper methods for mutant code
    private static boolean getCondition() {
        return true;
    }

    private static int getSwitchValue() {
        return 0;
    }
}