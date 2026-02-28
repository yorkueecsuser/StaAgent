class MathRoundIntLongBug {

    private int getValue() {
        return 0; // Always returns 0 to make the switch statement unreachable
    }

    public int showBug(long number) {
        int value = getValue();
        switch(value) {
            case 1:
                // This case will never be reached
                System.out.println("Unreachable code");
                break;
        }
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    }
}