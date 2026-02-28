class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");

        // Mutant: Unreachable switch statement
        int value = getFalseValue();
        switch (value) {
            case 1:
                System.out.println("This code will never execute.");
                break;
            default:
                // Default case is necessary for a valid switch statement
                break;
        }

        return result;
    }

    // Method that always returns a false value at runtime
    private int getFalseValue() {
        return -1;
    }
}