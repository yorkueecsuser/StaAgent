class DoubleBug {
    public double showBug(int value) {
        boolean shouldSwitch = getUnreachableCondition(); // A method call to ensure the condition is dynamically determined at runtime

        if (shouldSwitch) {
            int unreachableValue = 0; // A constant value that will never match any case label
            switch (unreachableValue) { // Unreachable switch statement
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return Double.longBitsToDouble((long) value); // Noncompliant - May lead to incorrect value due to interpretation of most significant bit
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false to make the switch statement unreachable
    }
}