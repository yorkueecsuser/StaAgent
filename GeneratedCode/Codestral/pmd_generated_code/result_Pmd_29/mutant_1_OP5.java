class ComparisonWithNaNBug {

    private int getValue() {
        return 0; // Always returns a value that makes the switch unreachable
    }

    public boolean showBug(double value) {
        // Original code
        boolean result = value == Double.NaN;

        // Added unreachable switch statement
        int switchValue = getValue();
        switch(switchValue) {
            case 1:
                System.out.println("This code should never be executed");
                break;
        }

        return result;
    }
}