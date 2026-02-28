class LossyPrimitiveCompareBug {
    public int showBug() {
        // Original code
        int comparisonResult = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // Mutant code
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                // This code block will never be executed because the switch condition always evaluates to false
                System.out.println("Unreachable code block");
                break;
            default:
                // Default block
                break;
        }

        return comparisonResult;
    }

    private int getUnreachableValue() {
        // This method returns a value that will never be 1 to make the switch statement unreachable
        return 0;
    }
}