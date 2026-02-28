class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // Original code
        boolean result = value == 200;

        // Mutant: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                // This code is unreachable
                System.out.println("This is an unreachable switch case");
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1
        return 0;
    }
}