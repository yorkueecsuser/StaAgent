class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        boolean unreachableCondition = getUnreachableCondition();
        for (int j = 0; j < 10 && unreachableCondition; j++) { // Unreachable for loop inserted here
            // The inserted loop is unreachable as the getUnreachableCondition() always returns false
        }
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            result += getStringFromSomeWhere(i);
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // A placeholder method to return false for unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}