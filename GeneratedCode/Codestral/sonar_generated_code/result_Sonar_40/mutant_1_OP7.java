class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}