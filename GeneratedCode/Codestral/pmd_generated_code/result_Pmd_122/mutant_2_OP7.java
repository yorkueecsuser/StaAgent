class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            result += getStringFromSomeWhere(i);
            // MUTANT: Unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because getCondition() always returns false
                System.out.println("This is an unreachable block");
            }
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // Placeholder method for getting condition
    private boolean getCondition() {
        return false;
    }
}