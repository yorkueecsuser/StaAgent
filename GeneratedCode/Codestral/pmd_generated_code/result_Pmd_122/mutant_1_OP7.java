class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            result += getStringFromSomeWhere(i);
        }

        // Added unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("Unreachable loop executed!");
        }

        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // Placeholder method to determine the condition dynamically at runtime
    private boolean getCondition() {
        // Implement logic to determine the condition dynamically
        return false;
    }
}