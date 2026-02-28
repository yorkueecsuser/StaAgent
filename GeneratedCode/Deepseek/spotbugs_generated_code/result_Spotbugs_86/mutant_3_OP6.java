class BitwiseBug {
    public boolean showBug(int number) {
        // Original buggy code
        if ((number & 0) == 0) {
            // Unreachable for loop mutant
            boolean unreachableCondition = false;
            for (int i = 0; unreachableCondition; i++) {
                System.out.println("This code should never run.");
            }
            return true;
        } else {
            return false;
        }
    }

    // Method to simulate runtime condition for the unreachable for loop
    private boolean getCondition() {
        // This method returns false to make the loop unreachable
        return false;
    }
}