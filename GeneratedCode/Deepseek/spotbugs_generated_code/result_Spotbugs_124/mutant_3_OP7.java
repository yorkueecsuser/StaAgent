class RegularExpressionBug {
    private boolean getFalse() {
        return false;
    }

    public String showBug(String input) {
        String output = input.replace(".", "|"); // The original bug remains

        // Mutant code - Unreachable while loop
        boolean conditionWhile = getFalse();
        while (conditionWhile) {
            // This loop is unreachable
            System.out.println("Unreachable code");
        }

        return output;
    }
}