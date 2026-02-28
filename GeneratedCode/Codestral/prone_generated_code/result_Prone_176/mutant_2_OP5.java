class XorPowerBug {
    public int showBug(int base, int exponent) {
        // Unreachable switch statement
        boolean isUnreachable = false;
        int val = getValue(); // Replace getValue() with an appropriate method that always returns a value that won't match any case
        switch (val) {
            case 1:
                isUnreachable = true;
                break;
            // Add more cases if necessary
        }
        if (isUnreachable) {
            System.out.println("Unreachable code executed");
        }

        return base ^ exponent; // BUG: XorPower
    }

    // Replace the following method with an appropriate method that always returns a value that won't match any case in the switch statement
    private int getValue() {
        return -1;
    }
}